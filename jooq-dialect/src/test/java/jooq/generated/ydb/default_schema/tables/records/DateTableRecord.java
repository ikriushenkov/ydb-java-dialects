/*
 * This file is generated by jOOQ.
 */
package jooq.generated.ydb.default_schema.tables.records;


import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jooq.generated.ydb.default_schema.tables.DateTable;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DateTableRecord extends UpdatableRecordImpl<DateTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.int_col</code>.
     */
    public void setIntCol(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.int_col</code>.
     */
    public Integer getIntCol() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.percent</code>.
     */
    public void setPercent(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.percent</code>.
     */
    public Double getPercent() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.big</code>.
     */
    public void setBig(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.big</code>.
     */
    public BigDecimal getBig() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.date</code>.
     */
    public void setDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.datetime</code>.
     */
    public void setDatetime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.datetime</code>.
     */
    public LocalDateTime getDatetime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.timestamp</code>.
     */
    public void setTimestamp(Instant value) {
        set(6, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.timestamp</code>.
     */
    public Instant getTimestamp() {
        return (Instant) get(6);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.date_table.interval</code>.
     */
    public void setInterval(Duration value) {
        set(7, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.date_table.interval</code>.
     */
    public Duration getInterval() {
        return (Duration) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DateTableRecord
     */
    public DateTableRecord() {
        super(DateTable.DATE_TABLE);
    }

    /**
     * Create a detached, initialised DateTableRecord
     */
    public DateTableRecord(ULong id, Integer intCol, Double percent, BigDecimal big, LocalDate date, LocalDateTime datetime, Instant timestamp, Duration interval) {
        super(DateTable.DATE_TABLE);

        setId(id);
        setIntCol(intCol);
        setPercent(percent);
        setBig(big);
        setDate(date);
        setDatetime(datetime);
        setTimestamp(timestamp);
        setInterval(interval);
        resetChangedOnNotNull();
    }
}