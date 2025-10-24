package com.jspider.javainterviewquestionsdays100;

/**
 * <h1>What is the Output of This Code?</h1>
 * <p>To understand this question, guys, you have to understand two things.
 * One is the concept of static variable and the concept of instance variable.
 * I am not talking about local variable here.
 * Understand that local variables can be used only in the block in
 * which they are declared. Now let's talk about static variables. Static
 * variables are associated with the class. We can use them directly with
 * the class. The most important static variables are shared among all objects.
 * That means if one object changes the value of that variable, the other object  *  will see the effect of
that variable. But guys, the instance
 * variables are that which is an instance variable. Each object has its own
 * copy. So if there is any change in its variable, then the object will have
 * to see the effect. If we change the instance variable, then it will not have
 * any effect on the other one. What is happening here is that we have created
 * an object Calc and another object Calc 2.</p>
 * <li>Static Variable<code>x</code></li>
 * <li>Instance Variable<code>y</code></li>
 */
public class Day12 {

    static int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Day12 obj1 = new Day12();
        Day12 obj2 = new Day12();

        obj1.x+=10; // 10+10 = 20
        obj2.x+=20; // 20+20 = 40
        System.out.println(obj1.x+obj2.y); // 40+20 = 60
    }
}
