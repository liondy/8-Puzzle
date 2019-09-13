# 8-Puzzle

Untuk menjalankan program ini, bisa dijalankan dengan netbeans project. Program ini hanya berisi simulasi permasalahan 8-puzzle dengan algoritma BFS dan A*

## Run this project
To compile and run this project, you need JDK 8 and Netbeans 8.2. Download this folder to your local computer and open it with netbeans

## Deskripsi Program
Program yang mensimulasikan penyelesaian 8-puzzle

## Spesifikasi Input:
Input diawali dengan kalimat "Input your board: ". Baris berikutnya berupa input 9 angka (0-8) acak dalam bentuk array 2D berukuran 3x3. Input kemudian dilanjutkan dengan "Pilih algoritma: 0=BFS, 1=A*". Input diakhiri dengan kalimat "Searching for solution..."

## Spesifikasi Output:
Output diawali dengan "Solution found after n steps" dengan n merupakan jumlah langkah yang dibutuhkan untuk menyelesaikan puzzle tersebut. Baris berikutnya diawali dengan "Step: x" dengan x merupakan langkah ke-x (0<=x<=n). Saat x bernilai 0, akan di print juga (Initial State), dan saat x bernilai n, akan di print juga (Goal State). Untuk setiap step, akan dikeluarkan kondisi papan saat ini.

## Sample Input:
Input your board: <br>
1 4 2 <br>
3 0 5 <br>
6 7 8 <br>
Searching for solution...

## Sample Output:
Solution found after 20 steps <br>
Step: 0 (Initial State) <br>
1 4 2 <br>
3 0 5 <br>
6 7 8 <br>

Step: 1 <br>
1 4 2 <br>
0 3 5 <br>
6 7 8 <br>

Step: 2 <br>
1 4 2 <br>
6 3 5 <br>
0 7 8 <br>

Step: 3 <br>
1 4 2 <br>
6 3 5 <br>
7 0 8 <br>

Step: 4 <br>
1 4 2 <br>
6 3 5 <br>
7 8 0 <br>

Step: 5 <br>
1 4 2 <br>
6 3 0 <br>
7 8 5 <br>

Step: 6 <br>
1 4 2 <br>
6 0 3 <br>
7 8 5 <br>

Step: 7 <br>
1 4 2 <br>
0 6 3 <br>
7 8 5 <br>

Step: 8 <br>
1 4 2 <br>
7 6 3 <br>
0 8 5 <br>

Step: 9 <br>
1 4 2 <br>
7 6 3 <br>
8 0 5 <br>

Step: 10 <br>
1 4 2 <br>
7 0 3 <br>
8 6 5 <br>

Step: 11 <br>
1 0 2 <br>
7 4 3 <br>
8 6 5 <br>

Step: 12 <br>
1 2 0 <br>
7 4 3 <br>
8 6 5 <br>

Step: 13 <br>
1 2 3 <br>
7 4 0 <br>
8 6 5 <br>

Step: 14 <br>
1 2 3 <br>
7 4 5 <br>
8 6 0 <br>

Step: 15 <br>
1 2 3 <br>
7 4 5 <br>
8 0 6 <br>

Step: 16 <br>
1 2 3 <br>
7 4 5 <br>
0 8 6 <br>

Step: 17 <br>
1 2 3 <br>
0 4 5 <br>
7 8 6 <br>

Step: 18 <br>
1 2 3 <br>
4 0 5 <br>
7 8 6 <br>

Step: 19 <br>
1 2 3 <br>
4 5 0 <br>
7 8 6 <br>

Step: 20 (Goal State) <br>
1 2 3 <br>
4 5 6 <br>
7 8 0 <br>

### Note
Program ini masih dalam tahap pengembangan, beberapa test case aneh mungkin tidak akan ditemukan solusinya.
