package com.example.tugas4_recyclerview;

public class Pengguna {
        private String nama,pekerjaan ,Asal;
        private int profil;
        public Pengguna(String nama, String pekerjaan, String Asal, int profil){
            this.nama = nama;
            this.pekerjaan  = pekerjaan ;
            this.Asal = Asal;
            this.profil = profil;
        }
        public String getNama(){

            return nama;
        }
        public void setNama(String nama){

            this.nama = nama;
        }
        public String getpekerjaan (){

            return pekerjaan ;
        }
        public void setpekerjaan (String pekerjaan ){

            this.pekerjaan  = pekerjaan ;
        }
        public String getAsal(){
            return Asal;
        }
        public void setAsal(String Asal) {

            this.Asal = Asal;
        }

        public int getProfil() {

            return profil;
        }

        public void setProfil(int profil){

            this.profil= profil;
        }
}

