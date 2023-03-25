package j4_abstraction;

 class WindowsPhone extends Android {
    void cameraFunction() {
        System.out.println("Windows phone has awesome UI");
    }

    public static void main(String[] args) {
    WindowsPhone WP = new WindowsPhone();
    WP.cameraFunction();
    WP.features();
    }
}