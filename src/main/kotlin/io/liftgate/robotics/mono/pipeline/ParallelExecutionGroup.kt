package io.liftgate.robotics.mono.pipeline

import java.util.concurrent.CompletableFuture

/**
 * @author GrowlyX
 * @since 10/22/2023
 */
interface ParallelExecutionGroup : ExecutionGroup
{
    override fun execute(level: Int, metadata: ExecutionMetadata)
    {
        val future = CompletableFuture.allOf(
            *members
                .map {
                    CompletableFuture
                        .runAsync {
                            it.timedExecution(metadata, level + 1)
                        }
                }
                .toTypedArray()
        )

        // wait until all are done
        future.join()
    }
}
