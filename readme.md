# Laporan Praktikum 5 - Abstract Class & Interface

Repositori ini berisi laporan dan source code Praktikum 5 mata kuliah Pemrograman Berorientasi Objek (PBO) Program Studi D3 Teknik Informatika, Politeknik Negeri Bandung.

## Identitas

* **Nama**: Rama Dwi Nugraha
* **NIM**: 251511027
* **Kelas**: D3-1A
* **Mata Kuliah**: Pemrograman Berorientasi Objek
* **Tahun**: 2026

## Topik Praktikum

Praktikum 5 membahas beberapa konsep utama dalam Pemrograman Berorientasi Objek, yaitu:

1. Abstract class dan abstract method
2. Interface sebagai kontrak behavior
3. Penggunaan `extends` dan `implements`
4. Inheritance chain
5. Perbedaan abstract class dan interface
6. Encapsulation pada hierarchy class

## Struktur Folder

```text
NIM_Nama_PBO5/
├── Laporan_PBO5.pdf
├── README.md
└── source/
    ├── Sortable.java
    ├── Employee.java
    ├── Manager.java
    ├── EmployeeTest.java
    ├── Goods.java
    ├── Food.java
    ├── Taxable.java
    ├── Toy.java
    ├── Book.java
    └── GoodsTest.java
```

## Ringkasan Praktikum

### Praktikum I: Employee, Manager, dan Sortable

Praktikum pertama membahas penggunaan abstract class dan inheritance.

* `Sortable` merupakan abstract class yang memiliki abstract method `compare(...)`.
* `Employee` extends `Sortable` dan mengimplementasikan method `compare(...)`.
* `Manager` extends `Employee` sehingga mewarisi method dan atribut dari `Employee`.
* Inheritance membentuk hubungan bertingkat dari `Sortable`, `Employee`, hingga `Manager`.
* Java tidak mengizinkan sebuah class untuk extends lebih dari satu class.

### Praktikum II: Goods dan Taxable

Praktikum kedua membahas penggunaan interface dan inheritance.

* `Goods` menjadi superclass bagi `Food`, `Toy`, dan `Book`.
* `Taxable` merupakan interface yang memiliki method `calculateTax()`.
* `Toy` dan `Book` implements `Taxable` sehingga wajib menyediakan implementasi `calculateTax()`.
* `Food` tidak implements `Taxable` karena tidak memiliki kewajiban untuk menghitung pajak.
* Class konkret yang implements interface harus memenuhi seluruh kontrak method yang ditentukan oleh interface tersebut.

## Cara Menjalankan Program

Pastikan JDK sudah terpasang sebelum menjalankan program.

### Compile

Jalankan perintah berikut dari folder utama repositori:

```bash
javac source/*.java
```

### Menjalankan Praktikum I

```bash
java -cp source EmployeeTest
```

### Menjalankan Praktikum II

```bash
java -cp source GoodsTest
```

## Catatan

* Source code pada repositori ini merupakan hasil Praktikum 5 PBO.
* Bukti output program dan hasil eksperimen disertakan dalam laporan PDF.
* Laporan disusun berdasarkan Modul Praktikum 5 Pemrograman Berorientasi Objek Politeknik Negeri Bandung.
