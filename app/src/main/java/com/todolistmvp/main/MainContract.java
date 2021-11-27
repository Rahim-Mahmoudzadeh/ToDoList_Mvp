package com.todolistmvp.main;

import com.todolistmvp.BasePresenter;
import com.todolistmvp.BaseView;
import com.todolistmvp.model.Task;

import java.util.List;

public interface MainContract {

    interface View extends BaseView {
        void showTasks(List<Task> tasks);

        void clearTasks();

        void updateTask(Task task);

        void addTask(Task task);

        void deleteTask(Task task);

        void setEmptyStateVisibility(boolean visible);

    }

    interface Presenter extends BasePresenter<View> {
        void onDeleteAllBtnClick();

       void onSearch(String q);

        void onTaskItemClick(Task task);

    }
}
