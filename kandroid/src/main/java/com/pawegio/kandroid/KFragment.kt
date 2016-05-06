/*
 * Copyright 2015-2016 Paweł Gajda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pawegio.kandroid

import android.app.Fragment
import android.preference.PreferenceManager
import android.support.v4.app.Fragment as SupportFragment

fun Fragment.getDefaultSharedPreferences() = PreferenceManager.getDefaultSharedPreferences(activity)

fun Fragment.toast(text: CharSequence) = activity.toast(text)

fun Fragment.longToast(text: CharSequence) = activity.longToast(text)

fun SupportFragment.getDefaultSharedPreferences() = PreferenceManager.getDefaultSharedPreferences(activity)

fun SupportFragment.toast(text: CharSequence) = activity.toast(text)

fun SupportFragment.longToast(text: CharSequence) = activity.longToast(text)