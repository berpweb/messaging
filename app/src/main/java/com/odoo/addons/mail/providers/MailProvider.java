/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 *
 * Created on 12/3/15 5:17 PM
 */
package com.odoo.addons.mail.providers;

import com.odoo.base.addons.mail.MailMessage;
import com.odoo.core.orm.provider.BaseModelProvider;

public class MailProvider extends BaseModelProvider {
    public static final String TAG = MailProvider.class.getSimpleName();

    @Override
    public String authority() {
        return MailMessage.AUTHORITY;
    }
}