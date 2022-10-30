package abstractclass.entity

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.global.GD

@RegisterClass("Player")
class Player: BaseEntity() {
    @RegisterFunction
    override fun _ready(){
        GD.print("I am the player!")
    }
}