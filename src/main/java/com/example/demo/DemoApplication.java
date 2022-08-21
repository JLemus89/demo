package com.example.demo;

import java.time.LocalDate;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class, args);
        Task1 t1 = new Task1("Recordar POO",false,LocalDate.of(2022,8,19));
        Task1 t2 = new Task1("Conocer Intellij IDEA",false,LocalDate.of(2022,8,20));
        Task1 t3 = new Task1("Conocer de Spring Boot",false,LocalDate.of(2022,8,21));
        Task1 t4 = new Task1("Finalizando Tareas...",false,LocalDate.of(2022,8,23));
        Task1 t5 = new Task1("Recuperar Finalizando Tareas", false,LocalDate.of(2022,8,27));
/*
        System.out.println("descripción de la tarea: ");
        System.out.println(t1.getDescription());
        System.out.println("fecha de tarea: ");
        System.out.println(t1.getDueDate());
        System.out.println("tarea realizada: ");
        System.out.println(t1.getDone());


//Modificando descripcion de t1

        System.out.println("tarea modificada: ");
        t1.setDescription("Modificando POO");
        System.out.println(t1.getDescription());
*/

        TaskList1 metas= new TaskList1("Tareas Iniciales"); //crear una instancia de la clase TaskList1

        metas.addTaskList(t1);//agregar la t1 a la lista
        metas.addTaskList(t2);//agregar la t2 a la lista
        metas.addTaskList(t3);//agregar la t3 a la lista
        metas.addTaskList(t4);
        metas.addTaskList(t5);

       /* System.out.println("Tareas Iniciales");
        metas.printTasks();*/

        metas.removeTask("Recordar POO");//Registro el valor de la descripción de la tarea a eliminar
        System.out.println("Tareas pendientes");
        metas.printTasks();//Imprime las tareas pendientes
    }


}
