package com.example.todoappcompose.util

class Enums {
    enum class Action {
        ADD,
        UPDATE,
        DELETE,
        DELETE_ALL,
        UNDO,
        NO_ACTION
    }

    enum class SearchAppBarState {
        OPENED,
        CLOSED,
        TRIGGERED
    }

    enum class TrailingIconState {
        READY_TO_DELETE,
        READY_TO_CLOSE
    }
}