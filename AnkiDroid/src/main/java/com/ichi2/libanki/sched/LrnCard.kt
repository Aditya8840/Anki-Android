/****************************************************************************************
 * Copyright (c) 2020 Arthur Milchior <arthur@milchior.fr>                              *
 *                                                                                      *
 * This program is free software; you can redistribute it and/or modify it under        *
 * the terms of the GNU General Public License as published by the Free Software        *
 * Foundation; either version 3 of the License, or (at your option) any later           *
 * version.                                                                             *
 *                                                                                      *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY      *
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A      *
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.             *
 *                                                                                      *
 * You should have received a copy of the GNU General Public License along with         *
 * this program.  If not, see <http://www.gnu.org/licenses/>.                           *
 ****************************************************************************************/

package com.ichi2.libanki.sched

import com.ichi2.libanki.Card
import com.ichi2.libanki.Collection
import com.ichi2.utils.KotlinCleanup

@KotlinCleanup("make col non-null")
@KotlinCleanup("IDE Lint")
class LrnCard(col: Collection?, val due: Long, cid: Long) :
    Card.Cache(
        col!!, cid
    ),
    Comparable<LrnCard> {
    override fun compareTo(other: LrnCard): Int {
        return java.lang.Long.compare(due, other.due)
    }
}
