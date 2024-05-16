package com.uptc.frw.excecutor;

import com.uptc.frw.conf.PersistenceUtil;
import com.uptc.frw.models.*;
import jakarta.persistence.EntityManager;

import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //insertar_datos_detalle_bill(); ;
        EntityManager en= PersistenceUtil.getEntityManager();

    }

    public static void example(){
       /* EntityManager en= PersistenceUtil.getEntityManager();
        Person persona=en.find(Person.class,1);
        System.out.println(persona);
        System.out.println(persona.getList_bills());
        Bill bill=en.find(Bill.class,1);
        System.out.println(bill);
        System.out.println(bill.getPerson());

 Person person=en.find(Person.class,1);
        Book book =en.find(Book.class,100);
        System.out.println(person);
        List<Person> persons=book.getAuthors();
        System.out.println(persons);
        persons.add(person);
        en.getTransaction().begin();
        en.persist(book);
        en.getTransaction().commit();
        */
    }

    public static  void insertar_datos_detalle_bill(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Bill bill =en.find(Bill.class,3);
        bill.setFecha(new Date());
        Person person=en.find(Person.class,1);
        bill.setPerson(person);
        en.persist(bill);
        for (int i=35;i<40;i++) {
            DetailBuy billDetail = new DetailBuy();
            billDetail.setId_detail((long) i);
            billDetail.setBill(bill);
            Book book=en.find(Book.class,200);
            billDetail.setBooks(book);
            billDetail.setCant(34L);
            en.persist(billDetail);
        }
        en.getTransaction().begin();
        en.getTransaction().commit();
    }
{}
    public  static void Insertar_datos_bill(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Bill bill= new Bill();
        bill.setId_compra(3L);
        bill.setFecha(new Date());
        Person person=en.find(Person.class,1);
        bill.setPerson(person);
        en.persist(bill);
        for (int i=10;i<20;i++) {
            DetailBuy billDetail = new DetailBuy();
            billDetail.setId_detail((long) i);
            billDetail.setBill(bill);
            Book book=en.find(Book.class,200);
            billDetail.setBooks(book);
            billDetail.setCant(34L);
            en.persist(billDetail);
        }
        en.getTransaction().begin();
        en.getTransaction().commit();
    }
    public static void addBillWithPerson(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Person person=en.find(Person.class,1);
        for (int cont = 20; cont < 30; cont++) {
            Bill bill = new Bill();
            bill.setId_compra((long) cont);
            bill.setPerson(person);
            bill.setFecha(new Date());
            en.persist(bill);
        }
        en.getTransaction().begin();
        en.getTransaction().commit();
    }
    public static void RelacionMuchosAUno(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Person person=en.find(Person.class,1);
        System.out.println(person);
        System.out.println(person.getList_bills());
        Bill bill =en.find(Bill.class,1);
        System.out.println(bill);
        System.out.println(bill.getPerson());
    }
    public static void uso_de_relaciones(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Book book=en.find(Book.class,100);
        System.out.println(book);
        System.out.println(book.getEdition());

        Edition edition=en.find(Edition.class,100);
        System.out.println(edition);
        System.out.println(edition.getBook());
    }

    public static void cambios_con_refresh(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Book book=en.find(Book.class,201L);
        book.setTitle("Libro cambiado");
        System.out.println(book);
        en.getTransaction().begin();
        en.refresh(book);
        en.getTransaction().commit();
        System.out.println(book);
    }
    public static void cambios_con_remove(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Book book=en.find(Book.class,201L);
        en.remove(book);
        en.getTransaction().begin();
        book.setTitle("Libro final");
        en.persist(book);
        en.getTransaction().commit();
    }
    public static void  cambios_sin_persist(){
        EntityManager en= PersistenceUtil.getEntityManager();
        Book book= en.find(Book.class,100);
        book.setTitle("libro del programador s");
        en.detach(book);
        en.getTransaction().begin();
        book.setPrice(4000.88);
        en.merge(book);
        en.getTransaction().commit();
    }
    public  static void cambios_con_persist(){
        Book book =new Book();
        book.setId(201L);
        book.setPrice(3000.0);
        book.setTitle("El libro");

        Book book2 =new Book(400L,"El gra libro",400.0);

        EntityManager en= PersistenceUtil.getEntityManager();
        en.getTransaction().begin();
        en.detach(book);
        en.persist(book);
        en.persist(book2);
        en.getTransaction().commit();
        //en.getTransaction().commit();
        en.close();

    }
    public static void find(){
        EntityManager en= PersistenceUtil.getEntityManager();
        en.getTransaction().begin();

        Person person=en.find(Person.class,1);
        System.out.println(person);

        Book book=en.find(Book.class,100);
        System.out.println(book);

        Bill bill=en.find(Bill.class,1);
        System.out.println(bill);

        DetailBuy det=en.find(DetailBuy.class,1);
        System.out.println(det);

        Edition edition = en.find(Edition.class,100);
        System.out.println(edition);
    }
}
