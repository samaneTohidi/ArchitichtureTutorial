package com.example.architichturetutorial

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.architichturetutorial.AbstractFactory.FactoryProducer
import com.example.architichturetutorial.Adapter.AudioPlayer
import com.example.architichturetutorial.Adapter.MediaPlayer
import com.example.architichturetutorial.Adapter.SoundAdapter
import com.example.architichturetutorial.Builder.Shape
import com.example.architichturetutorial.Composite.Professor
import com.example.architichturetutorial.Composite.Student
import com.example.architichturetutorial.Composite.University
import com.example.architichturetutorial.Factory.VehicleFactory
import com.example.architichturetutorial.Flyweight.OSSharedVars.getOS
import com.example.architichturetutorial.Flyweight.OSType
import com.example.architichturetutorial.ObjectPool.Computer
import com.example.architichturetutorial.ObjectPool.ComputerObjectPool
import com.example.architichturetutorial.Observer.BinObserver
import com.example.architichturetutorial.Observer.HexObserver
import com.example.architichturetutorial.Observer.OctObserver
import com.example.architichturetutorial.Observer.Subject
import com.example.architichturetutorial.Prototype.ShapeCloneMaker
import com.example.architichturetutorial.Strategy.RemoveZerosStrategy
import com.example.architichturetutorial.Strategy.SortAscendStrategy
import com.example.architichturetutorial.Strategy.SortDescendStrategy
import com.example.architichturetutorial.Strategy.contextStrategy
import com.example.architichturetutorial.Template.House
import com.example.architichturetutorial.Template.Type1House
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usePrototype()
        useObjectPool()
        useAdapter()
        useBuilder()
        useFlyweight()
        useComposite()
        useStrategy()
        useFactory()
        useAbstractFactory()
        useTemplate()
        useObserver()



    }

    fun usePrototype() {
        val cloneMaker = ShapeCloneMaker()
        val circle = cloneMaker.getShape("Circle")
    }

   fun useObjectPool(){
       val objectPool = ComputerObjectPool()
       objectPool.create()
       objectPool.create()
       objectPool.create()

       val mohammadComputer = objectPool.checkOut()
       val aliComputer = objectPool.checkOut()

       objectPool.checkIn(mohammadComputer)
   }


    fun useAdapter(){
        val audioPlayer = AudioPlayer()
        val mediaPlayer_1 = MediaPlayer(audioPlayer)

        mediaPlayer_1.play("mp3", "Du hast")

        val soundAdapter = SoundAdapter()
        val mediaPlayer_2 = MediaPlayer(soundAdapter)

        mediaPlayer_2.play("vlc", "Pulp Fiction")

    }

     fun useBuilder() {
              var shape: Shape = Shape.ShapeBuilder(11f, 22f).build()
         }

    fun useFlyweight(){

            val listOfComputers : MutableList<Computer> = ArrayList()
            for (ram in 1024..2048){
                listOfComputers.add(Computer(getOS(OSType.WIN), ram))
                listOfComputers.add(Computer(getOS(OSType.LIN), ram))
                listOfComputers.add(Computer(getOS(OSType.MAC), ram))
            }

    }

    fun useComposite()
    {
        val student = University()
        val literature1 = Student(101, "saman", "student")
        val literature2 = Student(102, "ali", "student")
        student.addStudent(literature1)
        student.addStudent(literature2)

        val masters = University()

        val art1 = Professor(11, "rezee", "Literature")
        val art2 = Professor(12, "samee", "Art")

        masters.addStudent(art1)
        masters.addStudent(art2)

        val directory = University()
        directory.addStudent(student)
        directory.addStudent(masters)
        directory.showDetails()
    }

    fun useStrategy(){
        var list: MutableList<Int> = ArrayList()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        var contextStrategy = contextStrategy(SortAscendStrategy(), list)
        val list1 = contextStrategy.doStrategy()
        println("ali$list1")

        contextStrategy = contextStrategy(SortDescendStrategy(), list)
        val list2 = contextStrategy.doStrategy()
        println("ali$list2")

        contextStrategy = contextStrategy(RemoveZerosStrategy(), list)
        var list3 = contextStrategy.doStrategy()
        print("ali$list3")

    }

   fun useFactory(){

       val vehicleFactory = VehicleFactory()
       val car = vehicleFactory.createVehicle("Car")
       car!!.showVehicleType()

       val motorCycle = vehicleFactory.createVehicle("MotorCycle")
       motorCycle!!.showVehicleType()
   }


     fun useAbstractFactory(){
         val vehicleFactory = FactoryProducer().getMachineFactory()
         val car = vehicleFactory
         car.getVehicle("Car")
         val motorCycle = vehicleFactory.getVehicle("MotorCycle")
         val colorFactory = FactoryProducer().getColorFactory()
         colorFactory.getColor("RED")?.fill()
         colorFactory.getColor("BLUE")?.fill()

     }

    fun useTemplate(){

        val houseType1: House = Type1House()
        houseType1.buildHouse()

    }


    fun useObserver(){

        val sub = Subject()
        HexObserver(sub)
        OctObserver(sub)
        BinObserver(sub)
        val scan = Scanner(System.`in`)
        for (i in 0..4) {
            print("\nEnter a number: ")
            sub.setState(scan.nextInt())
        }

    }

}

