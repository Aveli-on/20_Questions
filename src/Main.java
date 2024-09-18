import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*1. Класс "Человек"
  Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.
*/
class Person{
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.printf("Имя = %s , Возраст = %d ,Пол = %s", name, age, gender);
    }

    void upAge(int newAge) {
        age = age + newAge;
    }

    void changeName(String newName) {
        name = newName;
    }
}
/* 2. Наследование: Класс "Работник" и "Менеджер"
 Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.
*/
class Worker extends Person{
    double salary;
    Worker(String name, int age, String gender,double salary) {
        super(name, age, gender);
        this.salary=salary;
    }

}
class Manager extends Worker{
    Person[] employee;
    Manager(String name, int age, String gender,double salary,Person[] employee) {
        super(name, age, gender,salary);
        this.employee=employee;
    }
}
/* 3. Полиморфизм: Животные
 Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.
*/
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("af af");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("myu myu");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("mu mu");
    }
}
/*4. Абстрактный класс "Транспорт"
Создайте абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
*/
abstract class  Transport{
    abstract void move();
}
class Car extends Transport {
    public void move() {
        System.out.println("vrum vrum");
    }

}
class Bike extends Transport {
    public void move() {
        System.out.println("rum rum");
    }}

/*5. Класс "Книга" и "Библиотека"
Создайте класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг, поиска по автору и году публикации.
*/
class Book{
    String title;
    String author;
    int year;
    Book(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

}
class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book bookin) {
        books.add(bookin);
    }

    public Book searchAuthor(String sAuthor) {
        for (Book i : books) {
            if (i.author == sAuthor) {
                return i;
            }

        }
        return null;
    }

    public Book searchYear(int sYear) {
        for (Book i : books) {
            if (i.year == sYear) {
                return i;
            }

        }
        return null;
    }
}

/*6. Инкапсуляция: Банк
Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств. Обеспечьте инкапсуляцию для безопасности данных счета.
*/
class BankAccount{
    private int accountNumber;
    private double balance;
    BankAccount (int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void replenishment(double push){
        this.balance=this.balance+push;
    }
    public void withdrawal(double unPush){
        this.balance=this.balance+unPush;
    }
}
/*7. Счетчик объектов
Создайте класс Counter, который хранит количество созданных объектов данного класса. Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.
*/
class  Counter{
    static int count=0;
    Counter(){
        count++;
    }
}
/*8. Площадь фигур
Создайте абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.
*/
abstract class Shape{
    abstract double getArea();
}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }

    double getArea() {
        return Math.PI * 2 * r;
    }
}

class Rectangle extends Shape {
    int a;
    int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double getArea() {
        return a * b;
    }
}

/* 9. Наследование: Животные и их движения
 Создайте класс Animal с методом move().
 Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() (рыба плавает, птица летает, собака бегает).
*/
class Animal_task9 {
    void move(){
        System.out.println("right");
    }
}
class Fish extends Animal_task9{
    @Override void move(){
        System.out.println("down");
    }
}
class Bird extends Animal_task9{
    @Override void move(){
        System.out.println("up");
    }
}
class Dog_task9 extends Animal_task9{
    @Override void move(){
        System.out.println("left");
    }
}


/*10. Работа с коллекциями: Университет
Создайте класс Student с полями name, group, grade. Создайте класс University, который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.
*/class  Student{
    String name;
    String group;
    int grade;
}
class University{
    ArrayList<Student> students=new ArrayList<>();
    void addStudent(Student newStudent){
        students.add(newStudent);
    }
    Comparator<Student> compareByName = new Comparator<Student>() {

        public int compare(Student o1, Student o2) {

            return o1.name.compareTo(o2.name);
        }
    };
    void sortStudents(){
        Collections.sort(students,compareByName);
    }
    ArrayList<Student> filterStudents(int score){
        ArrayList<Student> students=new ArrayList<>();
        for(Student i:this.students){
            if (i.grade==score){
                students.add(i);
            }
        }
        return students;
    }
}
/* 11. Класс "Магазин"
 Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.
*/
class Product{
    String name;
    double price;
    int quantity;
}
class Store{
    ArrayList<Product> products=new ArrayList<>();
    void addProduct(Product newProduct){
        products.add(newProduct);
    }
    void deleteProduct(Product delProduct){
        products.remove(delProduct);
    }
    Product nameProduct(String newProduct){
        for(Product i:products){
            if (i.name==newProduct){
                return i;
            }
        }
        return null;
    }
}
/*12. Интерфейс "Платежная система"
Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.
*/
interface PaymentSystem{
    void pay();
    void refund();
}
class CreditCard implements PaymentSystem{
    public void pay(){
        System.out.println("pay");
    }
    public void refund(){
        System.out.println("refund");
    }
}
class PayPal implements PaymentSystem{
    public void pay(){
        System.out.println("pay");
    }
    public void refund(){
        System.out.println("refund");
    }
}
/*13. Генерация уникальных идентификаторов
Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.
*/class UniqueID {
    static int count = 0;

    UniqueID() {
        count++;
    }
}
/*14. Класс "Точка" и "Прямоугольник"
Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.
*/
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Rectangle_task14{
    Point x;
    Point y;
    Rectangle_task14(int x,int y,int x1,int y1){
        this.x=new Point(x,y);
        this.y=new Point(x1,y1);

    }
    double getS(){
        return (y.x-x.x)*(x.y-y.y) ;
    }
}
/*15. Комплексные числа
Создайте класс ComplexNumber с полями для действительной и мнимой частей. Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.
*/
class ComplexNumber {
    double deist;
    double mnim;

    ComplexNumber(double deist, double mnim) {
        this.deist = deist;
        this.mnim = mnim;
    }

    ComplexNumber sum(ComplexNumber a) {
        return new ComplexNumber(deist + a.deist, mnim + a.mnim);
    }

    ComplexNumber vich(ComplexNumber a) {
        return new ComplexNumber(deist - a.deist, mnim - a.mnim);
    }

    ComplexNumber umnozh(ComplexNumber a) {
        return new ComplexNumber(deist * a.deist - mnim * a.mnim, deist * a.mnim + mnim * a.deist);
    }

    ComplexNumber del(ComplexNumber a) {
        ComplexNumber b=a;
        b.mnim=a.mnim*(-1);
        return new ComplexNumber((deist * b.deist - mnim * b.mnim) / (Math.pow(a.deist, 2) + Math.pow(a.mnim, 2)), deist * b.mnim + mnim * b.deist);
    }
}
/* 16. Перегрузка операторов: Матрица
 Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
*/
class Matris{
    int[][] plus(int[][] b) {
        return null;
    }

    int[][] umnozh(int[][] b) {
        return null;
    }
}
class Matrix extends Matris{
    int[][] a=new int[3][3];
    @Override int[][] plus(int[][] b){
        int[][] c=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    @Override int[][] umnozh(int[][] b){
        int[][] c=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {

                int b1=a[i][j];
                int v=0;
                for (int k = 0; k <3 ; k++) {
                    v+=b1*b[k][j];
                }
                c[i][j]=v;

            }
        }
        return c;
    }
}
/*17. Создание игры с использованием ООП
Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.
*/
abstract class Character {
    int hp;
    int damage;

    Character(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }
    abstract void live();
}

class Player extends Character {
    Weapon weapon;

    Player(int hp, int damage, Weapon weapon) {
        super(hp, damage);
        this.weapon = weapon;

    }
    void live(){
        System.out.printf("Убивает врагов, hp: % damage: %d",hp,damage+weapon.power);
    }
}
class Enemy extends Character {
    Enemy(int hp, int damage) {
        super(hp, damage);
    }
    void live(){
        System.out.printf("Злой враг, hp: % damage: %d",hp,damage);
    }
}
class Weapon{
    int power;
    Weapon(int power){
        this.power=power;
    }
}
/* 18. Автоматизированная система заказов
 Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
*/
class Product_task18 {
    int cost;
    String name;

    Product_task18(String name, int cost) {
        this.cost = cost;
        this.name = name;
    }
}
class Order{
    ArrayList<Product_task18> products=new ArrayList<>();
    void addProduct(Product_task18 a){
        products.add(a);
    }
    int allSum(){
        int sum=0;
        for(Product_task18 i:products){
            sum+=i.cost;
        }
        return sum;
    }
}
class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    void addOrder(Order a) {
        orders.add(a);
    }

    void display() {
        int o=1;
        for (Order i : orders) {
            System.out.println("Заказ "+o);
            for(Product_task18 u:i.products){
                System.out.println(u.name);
            }
            o++;
        }
    }
}

/*19. Наследование: Электроника
Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.
*/
class Device{
    String brand;
    void turnOn(){
        System.out.println("turn on");
    }
    void turnOff(){
        System.out.println("turn off");
    }
    class Smartphone extends Device{
        void takePhoto(){
            System.out.println("click");
        }
    }
    class Laptop extends  Device{
        void internet(){
            System.out.println("connected");
        }
    }
}
/*20. Игра "Крестики-нолики"
Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.
*/
class ChessPlayer{
    static int count=0;
    int mark;
    String name;
    ChessPlayer(String name)    {
        this.name=name;
        count++;
        if (count==1){
            mark=1;
        }
        else{
            mark=-1;
        }
    }
}
class Game{
    int[][] dashboard=new int[3][3];
    void checkHod(int x,int y,ChessPlayer player){
        if(dashboard[x][y]!=0){
            System.out.println("Неправильный ход");
        }
        else {
            dashboard[x][y]=player.mark;
        }
    }
    void checkWin(){
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < 3; i++) {
            int sum=0;
            for (int j = 0; j <3; j++) {
                sum+=dashboard[i][j];
            }
            if (sum == 3 | sum == -3) {
                System.out.println("win player mark "+dashboard[i][i]);
                break;
            }
            sum1+=dashboard[i][i];

        }
        for (int i = 0; i < 3; i++) {
            int sum=0;
            for (int j = 0; j <3; j++) {
                sum+=dashboard[j][i];
            }
            if (sum == 3 | sum == -3) {
                System.out.println("win player mark "+dashboard[i][i]);
                break;
            }
        }
        int p=2;
        for (int i = 2; i >0; i--) {

            sum2+=dashboard[i-p][i];
            p=i==2?1:0;
        }
        if (sum1 == 3 | sum1 == -3) {
            System.out.println("win player mark "+dashboard[1][1]);
        }
        if (sum2 == 3 | sum2 == -3) {
            System.out.println("win player mark "+dashboard[1][1]);
        }

    }
}







class Main{
    public static void main(String[] args) {
        Animal[] animals={new Dog(),new Cat(),new Cow()};
        for(Animal o:animals){
            o.makeSound();
        }
    }
}