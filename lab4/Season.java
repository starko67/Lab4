package lab4;

public enum Season {
    Весна(15),
    Лето(25),
    Осень(16),
    Зима(-5);

    private int averageTemperature; // Средняя температура

    // Конструктор средней температуры
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Метод для получения средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Метод для описания времени года
    public String getDescription() {
        switch (this) {
            case Весна:
                return "Теплое время года";
            case Лето:
                return "Теплое время года";
            case Осень:
                return "Холодное время года";
            case Зима:
                return "Холодное время года";
            default:
                return "Неизвестное время года";
        }
    }

    public static void main(String[] args) {
        // Создаем переменную для любимого времени года
        Season favoriteSeason = Season.Лето;

        // Выводим информацию о любимом времени года
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + " градусов Цельсия");
        System.out.println("Описание времени года: " + favoriteSeason.getDescription());

        // Выводим информацию о всех временах года
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + " градусов Цельсия");
            System.out.println("Описание времени года: " + season.getDescription());
            System.out.println();
        }
    }
}
