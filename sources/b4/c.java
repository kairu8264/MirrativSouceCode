package b4;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import b4.a;
import b4.g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a.h f16930a;

    /* renamed from: b  reason: collision with root package name */
    public final g f16931b;

    /* renamed from: c  reason: collision with root package name */
    public b f16932c = new b();

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16933d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f16934e;

    /* loaded from: classes.dex */
    public static final class a {
        public static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        public static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public static final ThreadLocal<StringBuilder> f16935b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f16936a;

        public b() {
            TextPaint textPaint = new TextPaint();
            this.f16936a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        public static StringBuilder a() {
            ThreadLocal<StringBuilder> threadLocal = f16935b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        public boolean b(CharSequence charSequence, int i10, int i11) {
            StringBuilder a10 = a();
            a10.setLength(0);
            while (i10 < i11) {
                a10.append(charSequence.charAt(i10));
                i10++;
            }
            return f3.c.a(this.f16936a, a10.toString());
        }
    }

    /* renamed from: b4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0100c {

        /* renamed from: a  reason: collision with root package name */
        public int f16937a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final g.a f16938b;

        /* renamed from: c  reason: collision with root package name */
        public g.a f16939c;

        /* renamed from: d  reason: collision with root package name */
        public g.a f16940d;

        /* renamed from: e  reason: collision with root package name */
        public int f16941e;

        /* renamed from: f  reason: collision with root package name */
        public int f16942f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16943g;

        /* renamed from: h  reason: collision with root package name */
        public final int[] f16944h;

        public C0100c(g.a aVar, boolean z10, int[] iArr) {
            this.f16938b = aVar;
            this.f16939c = aVar;
            this.f16943g = z10;
            this.f16944h = iArr;
        }

        public static boolean d(int i10) {
            return i10 == 65039;
        }

        public static boolean f(int i10) {
            return i10 == 65038;
        }

        public int a(int i10) {
            g.a a10 = this.f16939c.a(i10);
            int i11 = 3;
            if (this.f16937a == 2) {
                if (a10 != null) {
                    this.f16939c = a10;
                    this.f16942f++;
                } else if (f(i10)) {
                    i11 = g();
                } else if (!d(i10)) {
                    if (this.f16939c.b() != null) {
                        if (this.f16942f == 1) {
                            if (h()) {
                                this.f16940d = this.f16939c;
                                g();
                            } else {
                                i11 = g();
                            }
                        } else {
                            this.f16940d = this.f16939c;
                            g();
                        }
                    } else {
                        i11 = g();
                    }
                }
                i11 = 2;
            } else if (a10 == null) {
                i11 = g();
            } else {
                this.f16937a = 2;
                this.f16939c = a10;
                this.f16942f = 1;
                i11 = 2;
            }
            this.f16941e = i10;
            return i11;
        }

        public b4.b b() {
            return this.f16939c.b();
        }

        public b4.b c() {
            return this.f16940d.b();
        }

        public boolean e() {
            return this.f16937a == 2 && this.f16939c.b() != null && (this.f16942f > 1 || h());
        }

        public final int g() {
            this.f16937a = 1;
            this.f16939c = this.f16938b;
            this.f16942f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f16939c.b().j() || d(this.f16941e)) {
                return true;
            }
            if (this.f16943g) {
                if (this.f16944h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f16944h, this.f16939c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public c(g gVar, a.h hVar, boolean z10, int[] iArr) {
        this.f16930a = hVar;
        this.f16931b = gVar;
        this.f16933d = z10;
        this.f16934e = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        d[] dVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (dVarArr = (d[]) editable.getSpans(selectionStart, selectionEnd, d.class)) != null && dVarArr.length > 0) {
            for (d dVar : dVarArr) {
                int spanStart = editable.getSpanStart(dVar);
                int spanEnd = editable.getSpanEnd(dVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            d[] dVarArr = (d[]) editable.getSpans(max, min, d.class);
            if (dVarArr != null && dVarArr.length > 0) {
                for (d dVar : dVarArr) {
                    int spanStart = editable.getSpanStart(dVar);
                    int spanEnd = editable.getSpanEnd(dVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        boolean b10;
        if (i10 != 67) {
            b10 = i10 != 112 ? false : b(editable, keyEvent, true);
        } else {
            b10 = b(editable, keyEvent, false);
        }
        if (b10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    public static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(Spannable spannable, b4.b bVar, int i10, int i11) {
        spannable.setSpan(this.f16930a.a(bVar), i10, i11, 33);
    }

    public final boolean e(CharSequence charSequence, int i10, int i11, b4.b bVar) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23 || bVar.h() <= i12) {
            if (bVar.d() == 0) {
                bVar.k(this.f16932c.b(charSequence, i10, i11));
            }
            return bVar.d() == 2;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010f, code lost:
        ((c4.h) r10).d();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0031, B:20:0x003b, B:22:0x003e, B:24:0x0042, B:26:0x004e, B:27:0x0051, B:29:0x005e, B:35:0x006d, B:36:0x007b, B:40:0x0096, B:48:0x00a6, B:51:0x00b2, B:52:0x00b7, B:53:0x00c1, B:55:0x00c8, B:56:0x00cd, B:58:0x00d8, B:60:0x00df, B:64:0x00e9, B:67:0x00f5, B:68:0x00fb, B:15:0x002b), top: B:81:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0031, B:20:0x003b, B:22:0x003e, B:24:0x0042, B:26:0x004e, B:27:0x0051, B:29:0x005e, B:35:0x006d, B:36:0x007b, B:40:0x0096, B:48:0x00a6, B:51:0x00b2, B:52:0x00b7, B:53:0x00c1, B:55:0x00c8, B:56:0x00cd, B:58:0x00d8, B:60:0x00df, B:64:0x00e9, B:67:0x00f5, B:68:0x00fb, B:15:0x002b), top: B:81:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.c.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
