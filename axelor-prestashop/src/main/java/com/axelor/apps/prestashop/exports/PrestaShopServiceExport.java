/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2018 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.prestashop.exports;

import java.io.IOException;

import com.axelor.apps.base.db.AppPrestashop;
import com.axelor.apps.base.db.Batch;
import com.axelor.apps.prestashop.service.library.PrestaShopWebserviceException;

public interface PrestaShopServiceExport {

	/**
	 * Exports ABS data to prestashop
	 * @param appConfig Configuration allowing to tune which objects are exported
	 * @param referenceDate Only objects created or modified after this timestamp
	 * will be exported (or those without filled prestashop id)
	 * @param batch Handle to currently running batch
	 * @throws PrestaShopWebserviceException
	 * @throws IOException
	 */
	public void export(AppPrestashop appConfig, Batch batch) throws PrestaShopWebserviceException, IOException;
}