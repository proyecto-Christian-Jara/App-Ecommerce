package com.christian.chicharroneriaapp.data

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// DataStore ligado al contexto
private val Context.dataStore by preferencesDataStore(name = "user_prefs")

class UserPrefs(private val context: Context) {
    companion object {
        private val KEY_HAS_SEEN_ONBOARDING = booleanPreferencesKey("has_seen_onboarding")
        private val KEY_AUTH_TOKEN = stringPreferencesKey("auth_token")
    }

    // Flow que devuelve true si ya vio el onboarding
    val hasSeenOnboarding: Flow<Boolean> =
        context.dataStore.data.map { it[KEY_HAS_SEEN_ONBOARDING] ?: false }

    // Flow que devuelve el token (o null si no existe)
    val authToken: Flow<String?> =
        context.dataStore.data.map { it[KEY_AUTH_TOKEN] }

    // Guardar si ya vio el onboarding
    suspend fun setHasSeenOnboarding(value: Boolean) {
        context.dataStore.edit { it[KEY_HAS_SEEN_ONBOARDING] = value }
    }

    // Guardar o borrar token
    suspend fun setAuthToken(token: String?) {
        context.dataStore.edit {
            if (token.isNullOrBlank()) it.remove(KEY_AUTH_TOKEN)
            else it[KEY_AUTH_TOKEN] = token
        }
    }
}
