package com.haile.stackoverflowuser.di.activity

import com.haile.stackoverflowuser.di.bookmark.BookmarkComponent
import com.haile.stackoverflowuser.di.bookmark.BookmarkModule
import com.haile.stackoverflowuser.di.reputation.ReputationComponent
import com.haile.stackoverflowuser.di.reputation.ReputationModule
import com.haile.stackoverflowuser.di.userlist.UserListComponent
import com.haile.stackoverflowuser.di.userlist.UserListModule
import com.haile.stackoverflowuser.modules.main.view.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)

    fun plusUserListComponent(userListModule: UserListModule) : UserListComponent

    fun plusReputationComponent(reputationModule: ReputationModule): ReputationComponent

    fun plusBookmarkComponent(bookmarkModule: BookmarkModule) : BookmarkComponent
}