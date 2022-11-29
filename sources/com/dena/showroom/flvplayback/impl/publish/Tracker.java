package com.dena.showroom.flvplayback.impl.publish;

import android.content.Context;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class Tracker {
    public static Tracker instance = new Tracker();

    /* renamed from: a  reason: collision with root package name */
    public long f26590a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f26591b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f26592c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f26593d = 0;

    /* renamed from: e  reason: collision with root package name */
    public FileOutputStream f26594e = null;

    public void appendLine(int i10, long j10) {
        long j11;
        long j12;
        if (this.f26594e == null) {
            return;
        }
        if (i10 == 0) {
            j11 = j10 - this.f26590a;
            this.f26590a = j10;
            j12 = this.f26591b;
            this.f26591b = 1 + j12;
        } else {
            j11 = j10 - this.f26592c;
            this.f26592c = j10;
            j12 = this.f26593d;
            this.f26593d = 1 + j12;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i10);
            stringBuffer.append(",");
            stringBuffer.append(j12);
            stringBuffer.append(",");
            stringBuffer.append(j10);
            stringBuffer.append(",");
            stringBuffer.append(j11);
            stringBuffer.append("\n");
            Log.d("Tracker", stringBuffer.toString());
            this.f26594e.write(stringBuffer.toString().getBytes());
        } catch (IOException e10) {
            Log.w("Tracker", e10);
        }
    }

    public void open(Context context) {
        try {
            this.f26594e = context.openFileOutput("buffer.csv", 0);
        } catch (FileNotFoundException e10) {
            Log.w("Tracker", e10);
        }
    }
}
