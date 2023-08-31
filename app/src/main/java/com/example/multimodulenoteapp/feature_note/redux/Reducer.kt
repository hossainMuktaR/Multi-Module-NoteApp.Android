package com.example.multimodulenoteapp.feature_note.redux

interface Reducer<A: Action, S: State> {

    fun reduce(
        action: A,
        currentState: S,
    ): S
}