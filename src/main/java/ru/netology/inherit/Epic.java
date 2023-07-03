package ru.netology.inherit;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {        //метод поискового запроса
        for (String tmp : subtasks) {            //создал переменную i в цикле for // после замечания о том что нужно
            if (tmp.contains(query)) {           //переименовать, переименовал в tmp
                return true;
            }
        }
        return false;
    }
}

