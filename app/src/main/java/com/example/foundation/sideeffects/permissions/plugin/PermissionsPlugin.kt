package com.example.foundation.sideeffects.permissions.plugin

import android.content.Context
import com.example.foundation.sideeffects.SideEffectMediator
import com.example.foundation.sideeffects.SideEffectPlugin
import com.example.foundation.sideeffects.permissions.Permissions

/**
 * Plugin for managing permissions from view-models.
 * This plugin allows using [Permissions] interface to view-model constructor.
 */
class PermissionsPlugin : SideEffectPlugin<PermissionsSideEffectMediator, PermissionsSideEffectImpl> {

    override val mediatorClass: Class<PermissionsSideEffectMediator>
        get() = PermissionsSideEffectMediator::class.java

    override fun createMediator(applicationContext: Context): SideEffectMediator<PermissionsSideEffectImpl> {
        return PermissionsSideEffectMediator(applicationContext)
    }

    override fun createImplementation(mediator: PermissionsSideEffectMediator): PermissionsSideEffectImpl {
        return PermissionsSideEffectImpl(mediator.retainedState)
    }

}