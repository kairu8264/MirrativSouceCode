package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m7.e;

/* loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] C = new StackTraceElement[0];
    public String A;
    public Exception B;

    /* renamed from: w  reason: collision with root package name */
    public final List<Throwable> f20149w;

    /* renamed from: x  reason: collision with root package name */
    public e f20150x;

    /* renamed from: y  reason: collision with root package name */
    public m7.a f20151y;

    /* renamed from: z  reason: collision with root package name */
    public Class<?> f20152z;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void a(Throwable th2, List<Throwable> list) {
        if (th2 instanceof GlideException) {
            for (Throwable th3 : ((GlideException) th2).e()) {
                a(th3, list);
            }
            return;
        }
        list.add(th2);
    }

    public List<Throwable> e() {
        return this.f20149w;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), f10.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.A);
        sb2.append(this.f20152z != null ? ", " + this.f20152z : "");
        sb2.append(this.f20151y != null ? ", " + this.f20151y : "");
        sb2.append(this.f20150x != null ? ", " + this.f20150x : "");
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb2.toString();
        }
        if (f10.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(f10.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : f10) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public final void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public void i(e eVar, m7.a aVar) {
        j(eVar, aVar, null);
    }

    public void j(e eVar, m7.a aVar, Class<?> cls) {
        this.f20150x = eVar;
        this.f20151y = aVar;
        this.f20152z = cls;
    }

    public void k(Exception exc) {
        this.B = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.A = str;
        setStackTrace(C);
        this.f20149w = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: w  reason: collision with root package name */
        public final Appendable f20153w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f20154x = true;

        public a(Appendable appendable) {
            this.f20153w = appendable;
        }

        public final CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f20154x) {
                this.f20154x = false;
                this.f20153w.append("  ");
            }
            this.f20154x = c10 == '\n';
            this.f20153w.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f20154x) {
                this.f20154x = false;
                this.f20153w.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f20154x = z10;
            this.f20153w.append(a10, i10, i11);
            return this;
        }
    }
}
