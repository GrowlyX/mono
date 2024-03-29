package io.liftgate.robotics.mono.gamepad

import com.qualcomm.robotcore.hardware.Gamepad

/**
 * @author GrowlyX
 * @since 9/4/2023
 */
enum class ButtonType(
    val gamepadMapping: (Gamepad) -> Boolean
)
{
    ButtonA(Gamepad::a),
    ButtonB(Gamepad::b),
    ButtonX(Gamepad::x),
    ButtonY(Gamepad::y),

    BumperLeft(Gamepad::left_bumper),
    BumperRight(Gamepad::right_bumper),

    JoystickLeft(Gamepad::left_stick_button),
    JoystickRight(Gamepad::left_stick_button),

    DPadLeft(Gamepad::dpad_left),
    DPadDown(Gamepad::dpad_down),
    DPadRight(Gamepad::dpad_right),
    DPadUp(Gamepad::dpad_up),

    PlayStationTouchpad(Gamepad::touchpad),
    PlayStationShare(Gamepad::share),
    PlayStationOptions(Gamepad::options),
    PlayStationLogo(Gamepad::ps),

    PlayStationCircle(Gamepad::circle),
    PlayStationCross(Gamepad::cross),
    PlayStationSquare(Gamepad::square),
    PlayStationTriangle(Gamepad::triangle)
}
