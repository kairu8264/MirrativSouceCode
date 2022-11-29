package com.dena.showroom.flvplayback;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface SampleSource {

    /* loaded from: classes3.dex */
    public interface Connection extends Closeable {
        boolean dequeueSample();

        Sample getLastSample();

        ByteBuffer getLastSampleData();

        boolean setBandwidth(double d10);
    }

    /* loaded from: classes3.dex */
    public static class ReopenRequiredException extends Exception {
    }

    /* loaded from: classes3.dex */
    public interface Sink {
        void onCrash(Connection connection, Throwable th2);

        void onSampleProduced(Connection connection);
    }

    Connection open(Sink sink, double d10);
}
