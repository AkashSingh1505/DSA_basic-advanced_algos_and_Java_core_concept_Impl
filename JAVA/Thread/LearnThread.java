/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package JAVA.Thread;
/*===============================================================================================================
                                               Thread

Thread Creation 2 ways: 
                    1. Extend Thread Class
                    2. Implement Runnable Interface

Categorization  of methods:-

Basic method : run(),start(), CurrentThread()[**Static**], isAlive()
Name readlted Method: getName(), setName(String)
priority method:  getPrioirty()[** 1 to 10 where 10 is highst **,  ** Main Thread By default priority is 5 **
Diamon melthod: setDiamon(Boolean), isDiamon() [ 
                : Daimon thread are the low priority thread which provide the service to the parent thread 
                : Parent thread is a thread in which we start the daimon thread
                : Daimon thread also inhertate its property from its parent thread Like Priority, Daimon Staus, Thread Group
                : Its Lifecycle depands on its parent thread ( if parent thread get die then it will also die even befor its completion


Preventing Thread Execution methods: Sleep(), yield(), join()
Intrupted methods: intrupt(), intrupted(), isIntrupt()

Thread synchronisation 
                    : Thread synchronisation can be done by two way 
                                                                    1. Mutual Exclusive
                                                                                a. Synchronized Method
                                                                                b. Synchronised(Object reference){} Block
                                                                    2. Cooperation
                                                                                a. wait()
                                                                                b. notify()
                                                                                c. notifyAll()
================================================================================================================*/
public class LearnThread {

  
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
