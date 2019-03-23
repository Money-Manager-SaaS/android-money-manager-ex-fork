/*
 * Copyright (C) 2012-2019 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.money.manager.ex.investment.events;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

import java.util.Date;

import info.javaperformance.money.Money;

/**
 * Raised when a price is downloaded. Used for currencies or stocks.
 */
@Parcel
public class PriceDownloadedEvent {

    @ParcelConstructor
    public PriceDownloadedEvent(String symbol, Money price, Date date) {
        this.symbol = symbol;
        this.price = price;
        this.date = date;
    }

    public String symbol;
    public Money price;
    public Date date;
}
