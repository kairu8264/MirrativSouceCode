package e2;

import android.view.inputmethod.EditorInfo;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e2.l;
import e2.r;
import e2.s;

/* loaded from: classes.dex */
public final class e0 {
    public static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void b(EditorInfo editorInfo, m mVar, a0 a0Var) {
        jo.p.h(editorInfo, "<this>");
        jo.p.h(mVar, "imeOptions");
        jo.p.h(a0Var, "textFieldValue");
        int d10 = mVar.d();
        l.a aVar = l.f30112b;
        int i10 = 6;
        if (l.l(d10, aVar.a())) {
            if (!mVar.f()) {
                i10 = 0;
            }
        } else if (l.l(d10, aVar.e())) {
            i10 = 1;
        } else if (l.l(d10, aVar.c())) {
            i10 = 2;
        } else if (l.l(d10, aVar.d())) {
            i10 = 5;
        } else if (l.l(d10, aVar.f())) {
            i10 = 7;
        } else if (l.l(d10, aVar.g())) {
            i10 = 3;
        } else if (l.l(d10, aVar.h())) {
            i10 = 4;
        } else if (!l.l(d10, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i10;
        int e10 = mVar.e();
        s.a aVar2 = s.f30136a;
        if (s.k(e10, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (s.k(e10, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (s.k(e10, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (s.k(e10, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (s.k(e10, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (s.k(e10, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (s.k(e10, aVar2.f())) {
            editorInfo.inputType = TsExtractor.TS_STREAM_TYPE_AC3;
        } else if (s.k(e10, aVar2.e())) {
            editorInfo.inputType = 18;
        } else if (s.k(e10, aVar2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!mVar.f() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (l.l(mVar.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int c10 = mVar.c();
            r.a aVar3 = r.f30131a;
            if (r.f(c10, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (r.f(c10, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (r.f(c10, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (mVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = y1.b0.n(a0Var.g());
        editorInfo.initialSelEnd = y1.b0.i(a0Var.g());
        r3.a.f(editorInfo, a0Var.h());
        editorInfo.imeOptions |= 33554432;
    }
}
