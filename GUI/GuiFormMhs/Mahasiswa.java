package GuiFormMhs;

public class Mahasiswa {
    private String nama;
    private String NIM;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }



        public String getJenjang() {
            char kodeP = NIM.charAt(0);
            if (kodeP == '1') {
                return "S1 (Sarjana)";
            } else if (kodeP == '2') {
                return "S2 (Magister)";
            } else if (kodeP == '3') {
                return "S3 (Doktor)";
            }
            return "UNKNOWN";
        }

        public String getTahun() {
            char kodeTm1 = NIM.charAt(1);
            char kodeTm2 = NIM.charAt(2);

            return "" + kodeTm1 + kodeTm2;
        }

        public String getFakultas() {
            char kodeFakultas = NIM.charAt(3);
            if (kodeFakultas == '1') {
                return "TARBIYAH DAN KEGURUAN";
            } else if (kodeFakultas == '2') {
                return "SYARIAH DAN HUKUM";
            } else if (kodeFakultas == '3') {
                return "USHULUDDIN";
            } else if (kodeFakultas == '4') {
                return "DAKWAH DAN KOMUNIKASI";
            } else if (kodeFakultas == '5') {
                return "SAINS DAN TEKNOLOGI";
            } else if (kodeFakultas == '6') {
                return "PSIKOLOGI";
            } else if (kodeFakultas == '7') {
                return "EKONOMI DAN ILMU SOSIAL";
            } else if (kodeFakultas == '8') {
                return "PERTANIAN DAN PERTERNAKAN";
            }
            return "UNKNOWN";
        }

        public String getJurusan() {
            char kodeFst = NIM.charAt(5);
            if (kodeFst == '1') {
                return "TEKNIK INFORMATIKA";
            } else if (kodeFst == '2') {
                return "TEKNIK INDUSTRI";
            } else if (kodeFst == '3') {
                return "SISTEM INFORMASI";
            } else if (kodeFst == '4') {
                return "MATEMATIKA";
            } else if (kodeFst == '5') {
                return "TEKNIK ELEKTRO";
            }
            return "UNKNOWN";
        }

        public String getJenisKelamin() {
            char kodeJk = NIM.charAt(6);
            if (kodeJk == '1') {
                return "LAKI-LAKI";
            } else if (kodeJk == '2') {
                return "PEREMPUAN";
            }
            return "UNKNOWN";
        }

        public String getNomorurut() {
            char kodeNomor1 = NIM.charAt(7);
            char kodeNomor2 = NIM.charAt(8);
            char kodeNomor3 = NIM.charAt(9);
            char kodeNomor4 = NIM.charAt(10);

            return "" + kodeNomor1 + kodeNomor2 + kodeNomor3 + kodeNomor4;
        }
    }





