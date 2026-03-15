# LAPORAN PRAKTIKUM
# PEMROGRAMAN BERBASIS OBJEK

## Posttest 2

### Sistem Pendataan Karyawan di Perusahaan

---

# 1. Identitas Praktikum

- NIM : 2409106016
- Nama : Azira Faradina
- Mata Kuliah : Pemrograman Berorientasi Objek
- Judul : Sistem Pendataan Karyawan di Perusahaan

---

# 2. Latar Belakang

Dalam dunia industri maupun organisasi, pengelolaan data karyawan merupakan hal yang sangat penting. Data karyawan biasanya mencakup informasi seperti identitas karyawan, jabatan, serta gaji yang diterima. Pengelolaan data secara manual dapat menimbulkan berbagai masalah seperti kesalahan pencatatan, kesulitan dalam pencarian data, serta ketidakefisienan dalam pengolahan informasi.

Seiring dengan perkembangan teknologi informasi, pengelolaan data dapat dilakukan secara digital menggunakan program komputer. Dengan memanfaatkan bahasa pemrograman, sebuah sistem sederhana dapat dibuat untuk membantu proses pendataan karyawan secara lebih efektif dan terstruktur.

Pada praktikum ini dibuat sebuah program sederhana menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek (Object Oriented Programming / OOP). Program ini dirancang untuk mengelola data karyawan melalui beberapa operasi dasar seperti menambahkan data, menampilkan data, memperbarui data, serta menghapus data.

Selain itu, program juga menggunakan struktur data ArrayList untuk menyimpan data karyawan secara dinamis sehingga jumlah data dapat bertambah maupun berkurang sesuai kebutuhan pengguna.

---

# 3. Deskripsi Program

Program Sistem Pendataan Karyawan di Perusahaan merupakan program bebasis bahasa pemrograman Java yang dibuat menggunakan konsep Object Oriented Programming (OOP). Program ini digunakan untuk mengelola data karyawan melalui menu yang tersedia di terminal.

Data karyawan yang dikelola meliputi ID karyawan, nama, jabatan, dan gaji. Data tersebut disimpan menggunakan ArrayList, sehingga jumlah data dapat bertambah atau berkurang secara dinamis.

Program memiliki beberapa fitur utama yaitu:

1. Menambahkan data karyawan
2. Menampilkan data karyawan
3. Mengubah data karyawan
4. Menghapus data karyawan

Pada Posttest 2, program dari Posttest sebelumnya dikembangkan lebih lanjut dengan menerapkan konsep Encapsulation, penggunaan Access Modifier, serta Getter dan Setter untuk mengatur akses terhadap data dalam class.

---

# 4. Perubahan Program

Pada Posttest kali ini dilakukan beberapa perubahan pada struktur program untuk menerapkan konsep Encapsulation.

---

## 4.1 Perubahaan Access Modifier pada Atribut

Pada Posttest sebelumnya, atribut dalam class Karyawan dideklarasikan tanpa access modifier sehingga dapat diakses langsung oleh class lain.

Contoh pada Posttest 1:

   `int id;

   String nama; 

   String jabatan; 

   double gaji;`

Dengan kondisi tersebut, class lain dapat langsung mengubah nilai atribut seperti berikut:

`   k.nama = "Azira";

   k.jabatan = "Manager";`

Cara ini kurang baik karena data dapat dimodifikasi tanpa kontrol.

Pada Posttest 2, atribut tersebut diubah menjadi private.

   `private int id; 
   
   private String nama; 
   
   private String jabatan; 
   
   private double gaji;`

Dengan menggunakan modifier private, atribut tidak dapat lagi diakses langsung dari class lain.

---

## 4.2 Penambahan Getter dan Setter

Karena atribut sekarang bersifat private, maka diperlukan method khusus untuk mengambil atau mengubah nilai atribut tersebut.

Method Getter:

   `public int getId() {
      return id;
   }`

Getter digunakan untuk mengambil nilai atribut.

Method Setter:

   `public void setNama(String nama) {
      this.nama = nama;
   }`

Setter digunakan untuk mengubah nilai atribut.

---

## 4.3 Perubahan Cara Mengakses Atribut di Class Main

Pada Posttest 1, atribut pada object Karyawan masih diakses secara langsung.

Contoh pada Posttest 1:

   `k.nama = input.nextLine();
   k.jabatan = input.nextLine();
   k.gaji = input.nextDouble();`

Pada Posttest 2, akses langsung tersebut diganti menggunakan setter.

Contoh pada Posttest 2:

   `k.setNama(input.nextLine());
   k.setJabatan(input.nextLine());
   k.setGaji(input.nextDouble());`

Dengan cara ini, perubahan nilai atribut dilakukan melalui method yang telah disediakan.

Untuk membaca nilai atribut, digunakan getter.

Contoh:

   `if (k.getId() == id) `

Perubahan ini merupakan penerapan konsep encapsulation.

---

## 4.4 Penambahan Berbagai Access Modifier

Pada Posttest 2 juga diterapkan beberapa jenis access modifier pada class `Karyawan`.

1. Private

Digunakan pada atribut agar data tidak bisa diakses langsung dari luar class.

Contoh:

```java
private String nama;
```

2. Public

Digunakan pada method getter dan setter agar method tersebut dapat dipanggil oleh class lain.

Contoh:

```java
public void setNama(String nama)
```

3. Protected

Digunakan pada method yang menampilkan data karyawan.

Contoh:

```java
protected void read()
```

Method ini masih bisa diakses oleh class lain dalam package yang sama.

4. Default

Default access modifier digunakan pada method yang tidak menuliskan modifier apapun.

Contoh:

```java
void infoKaryawan()
```

Method ini hanya bisa diakses oleh class yang berada dalam package yang sama.

---

# 5. Hasil Program

Program akan menampilkan menu utama yang berisi beberapa pilihan, yaitu:

1. Tambah Karyawan
2. Tampilkan Karyawan
3. Update Karyawan
4. Hapus Karyawan
5. Exit

Pengguna dapat memilih salah satu menu untuk menjalankan fungsi tertentu dalam sistem.

### Screenshot Output

1. Menu Program

   ![Menu Program](.../assets/Posttest_2/Menu.png)
2. Tambah Karyawan

   ![create_data](.../assets/Posttest_2/Create1.png)
   ![create_data_2](.../assets/Posttest_2/Create2.png)
3. Tampilkan Karyawan

   ![read_data](.../assets/Posttest_2/read_create.png)
4. Update Karyawan

   ![update_data](.../assets/Posttest_2/Update.png)
   ![read_data](.../assets/Posttest_2/read_update.png)
5. Hapus Karyawan

   ![delete_data](.../assets/Posttest_2/Delete.png)
   ![read_data](.../assets/Posttest_2/read_delete.png)
6. Exit

   ![exit](.../assets/Posttest_2/Exit.png)
---

# 6. Kesimpulan

Berdasarkan praktikum yang telah dilakukan, program pada Posttest 1 berhasil dikembangkan dengan menerapkan konsep Encapsulation pada Posttest 2.

Perubahan utama yang dilakukan adalah mengubah atribut menjadi private, menambahkan getter dan setter, serta menggunakan berbagai access modifier untuk mengatur hak akses terhadap atribut dan method.

Dengan penerapan encapsulation, data dalam class menjadi lebih aman karena tidak dapat diakses secara langsung oleh class lain dan hanya dapat dimodifikasi melalui method yang telah disediakan.