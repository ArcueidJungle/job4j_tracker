package ru.job4j.bank;

import java.util.Objects;

public class Account {

    /**
     * Класс описывает инициализацию экземпляра класса, работу геттеров и сеттеров для полей
     * экземпляра класса, а так же переопределяет работу для методов сравнения и хэш - кода
     * @author Ivan Lavrentev
     * @version 1.0
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор принимает поля requisite и balance и инициализирует ими поля класса
     * @param requisite реквизиты текущего экземляра.
     * @param balance   баланс текущего экземляра.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты счета.
     *
     * @return реквизиты текщего экземпляра.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает и устанавливает текущего элемента
     * @param requisite  реквизит текущего экземпляра
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * @return баланс текущего экземляра
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает и устанавливает баланс текущего экземляра
     * @param balance баланс текущего экземляра
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод принимает другой экземпляр и сравнивает его с текущим по полю requisite
     * @param o другой экземпляр для сравнения
     * @return возвращает true если равны, false если нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод возвращает хэш - код экземпляра для сравнения
     * @return возвращает хэш - код экземпляра
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}