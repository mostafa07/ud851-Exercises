package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {

    private WaitlistContract() {
    }

    public static final class WaitListEntry implements BaseColumns {

        private static final String TABLE_NAME = "waitlist";

        private static final String COLUMN_GUEST_NAME = "guestname";
        private static final String COLUMN_PARTY_SIZE = "partysize";
        private static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
