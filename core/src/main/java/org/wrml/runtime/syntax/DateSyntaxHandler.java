/**
 * WRML - Web Resource Modeling Language
 *  __     __   ______   __    __   __
 * /\ \  _ \ \ /\  == \ /\ "-./  \ /\ \
 * \ \ \/ ".\ \\ \  __< \ \ \-./\ \\ \ \____
 *  \ \__/".~\_\\ \_\ \_\\ \_\ \ \_\\ \_____\
 *   \/_/   \/_/ \/_/ /_/ \/_/  \/_/ \/_____/
 *
 * http://www.wrml.org
 *
 * Copyright (C) 2013 Mark Masse <mark@wrml.org> (OSS project WRML.org)
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
package org.wrml.runtime.syntax;

import java.util.Date;

import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

/**
 * TODO: Document the Date format and make it pluggable (config mapping of schema uri (w/ slot name) to date format?)
 */
public class DateSyntaxHandler extends SyntaxHandler<Date>
{

    @Override
    public String formatSyntaxValue(final Date date)
    {
        return DateUtils.formatDate(date);
    }

    @Override
    public Date parseSyntacticText(final String dateString)
    {
        try
        {
            return DateUtils.parseDate(dateString);
        }
        catch (final DateParseException e)
        {
            throw new SyntaxHandlerException("Failed to transform String value \"" + dateString + "\" to a Date", e,
                    this);
        }
    }
}
