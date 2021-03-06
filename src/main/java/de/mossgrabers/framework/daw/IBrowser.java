// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2018
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.daw;

import de.mossgrabers.framework.daw.data.IBrowserColumn;
import de.mossgrabers.framework.daw.data.IBrowserColumnItem;


/**
 * Provides access to the device, preset, sample, ... browser.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface IBrowser extends ObserverManagement
{
    /**
     * Returns true of the browser displays presets.
     *
     * @return True of the browser displays presets.
     */
    boolean isPresetContentType ();


    /**
     * Get the index of the content type (selection tab).
     *
     * @return The index
     */
    int getSelectedContentTypeIndex ();


    /**
     * Returns true if there is a previous content type.
     *
     * @return True if there is a previous content type
     */
    boolean hasPreviousContentType ();


    /**
     * Returns true if there is a next content type.
     *
     * @return True if there is a next content type
     */
    boolean hasNextContentType ();


    /**
     * Select the previous selection tab, if any.
     */
    void previousContentType ();


    /**
     * Select the next selection tab, if any.
     */
    void nextContentType ();


    /**
     * Get the selected content type.
     *
     * @return The selected content type.
     */
    String getSelectedContentType ();


    /**
     * Get the names of all content types (panes).
     *
     * @return The names
     */
    String [] getContentTypeNames ();


    /**
     * Open the browser to browse for presets.
     */
    void browseForPresets ();


    /**
     * Open the browser to browse for a device which will be inserted before the current one.
     */
    void browseToInsertBeforeDevice ();


    /**
     * Open the browser to browse for a device which will be inserted after the current one.
     */
    void browseToInsertAfterDevice ();


    /**
     * Stop browsing.
     *
     * @param commitSelection Commits the selection if true otherwise it is discarded.
     */
    void stopBrowsing (final boolean commitSelection);


    /**
     * Check if the browser is active.
     *
     * @return True if active
     */
    boolean isActive ();


    /**
     * Reset a filter to the default (all) value.
     *
     * @param column The index of the column to reset
     */
    void resetFilterColumn (final int column);


    /**
     * Get a filter column.
     *
     * @param column The index of the column to get
     * @return The column
     */
    IBrowserColumn getFilterColumn (final int column);


    /**
     * Get the number of filter columns.
     *
     * @return The number of filter columns
     */
    int getFilterColumnCount ();


    /**
     * Get the names of the filter columns.
     *
     * @return The names of the filter columns
     */
    String [] getFilterColumnNames ();


    /**
     * Get the result columns items.
     *
     * @return The item data
     */
    IBrowserColumnItem [] getResultColumnItems ();


    /**
     * Select the previous item of a filter column.
     *
     * @param columnIndex The index of the column
     */
    void selectPreviousFilterItem (final int columnIndex);


    /**
     * Select the next item of a filter column.
     *
     * @param columnIndex The index of the column
     */
    void selectNextFilterItem (final int columnIndex);


    /**
     * Select the previous item page of a filter column.
     *
     * @param columnIndex The index of the column
     */
    void previousFilterItemPage (final int columnIndex);


    /**
     * Select the next item page of a filter column.
     *
     * @param columnIndex The index of the column
     */
    void nextFilterItemPage (final int columnIndex);


    /**
     * Get the index of the select filter item of a column.
     *
     * @param columnIndex The index of the column
     * @return The index of the item
     */
    int getSelectedFilterItemIndex (final int columnIndex);


    /**
     * Select the previous results item.
     */
    void selectPreviousResult ();


    /**
     * Select the next results item.
     */
    void selectNextResult ();


    /**
     * Get the selected result item.
     *
     * @return The result
     */
    String getSelectedResult ();


    /**
     * Get the number of results to display on a page.
     *
     * @return The number oif results.
     */
    int getNumResults ();


    /**
     * Get the number of filter items to display on a page.
     *
     * @return The number oif results.
     */
    int getNumFilterColumnEntries ();
}