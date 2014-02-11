package org.gwtbootstrap3.client.shared.event;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;
import org.gwtbootstrap3.client.ui.TabListItem;

/**
 * @author godi
 */
public class TabShownEvent extends GwtEvent<TabShownHandler> implements TabEvent {

    private static final Type<TabShownHandler> TYPE = new Type<TabShownHandler>();

    private final TabListItem tab;
    private final Event nativeEvent;

    public static Type<TabShownHandler> getType() {
        return TYPE;
    }

    public TabShownEvent(final TabListItem tab, final Event nativeEvent) {
        this.tab = tab;
        this.nativeEvent = nativeEvent;
    }

    @Override
    public TabListItem getTab() {
        return tab;
    }

    @Override
    public Event getNativeEvent() {
        return nativeEvent;
    }

    @Override
    public Type<TabShownHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final TabShownHandler handler) {
        handler.onShown(this);
    }
}