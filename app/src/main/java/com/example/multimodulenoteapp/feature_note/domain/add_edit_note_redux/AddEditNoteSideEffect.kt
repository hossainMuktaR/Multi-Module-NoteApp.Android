package com.example.multimodulenoteapp.feature_note.domain.add_edit_note_redux

import com.example.multimodulenoteapp.feature_note.redux.SideEffect

sealed class AddEditNoteSideEffect: SideEffect{
    data class ShowSnackbar(val message: String): AddEditNoteSideEffect()
    object SaveNote: AddEditNoteSideEffect()
}
