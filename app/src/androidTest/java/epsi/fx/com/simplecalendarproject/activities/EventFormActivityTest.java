package epsi.fx.com.simplecalendarproject.activities;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by fx on 05/11/15.
 */
public class EventFormActivityTest extends ActivityInstrumentationTestCase2<EventFormActivity> {

    private EventFormActivity mEventFormActivity;

    public EventFormActivityTest() {
        super(EventFormActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mEventFormActivity = getActivity();
    }

    public void testPreconditions() {
        assertTrue(mEventFormActivity != null);
    }
}