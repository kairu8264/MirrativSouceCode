package ai;

import android.webkit.ConsoleMessage;

/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f8491a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f8491a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8491a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8491a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8491a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8491a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
