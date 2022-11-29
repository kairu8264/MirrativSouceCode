package e2;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final n f30154a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30155b;

    /* renamed from: c  reason: collision with root package name */
    public int f30156c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f30157d;

    /* renamed from: e  reason: collision with root package name */
    public int f30158e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30159f;

    /* renamed from: g  reason: collision with root package name */
    public final List<d> f30160g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30161h;

    public w(a0 a0Var, n nVar, boolean z10) {
        jo.p.h(a0Var, "initState");
        jo.p.h(nVar, "eventCallback");
        this.f30154a = nVar;
        this.f30155b = z10;
        this.f30157d = a0Var;
        this.f30160g = new ArrayList();
        this.f30161h = true;
    }

    public final void a(d dVar) {
        b();
        try {
            this.f30160g.add(dVar);
        } finally {
            c();
        }
    }

    public final boolean b() {
        this.f30156c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f30161h;
        return z10 ? b() : z10;
    }

    public final boolean c() {
        int i10 = this.f30156c - 1;
        this.f30156c = i10;
        if (i10 == 0 && (!this.f30160g.isEmpty())) {
            this.f30154a.c(xn.a0.D0(this.f30160g));
            this.f30160g.clear();
        }
        return this.f30156c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f30161h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f30160g.clear();
        this.f30156c = 0;
        this.f30161h = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f30161h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        jo.p.h(inputContentInfo, "inputContentInfo");
        boolean z10 = this.f30161h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f30161h;
        return z10 ? this.f30155b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new b(i10, i11));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new c(i10, i11));
            return true;
        }
        return z10;
    }

    public final void e(a0 a0Var) {
        jo.p.h(a0Var, "value");
        this.f30157d = a0Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    public final void f(a0 a0Var, o oVar, View view) {
        jo.p.h(a0Var, "state");
        jo.p.h(oVar, "inputMethodManager");
        jo.p.h(view, "view");
        if (this.f30161h) {
            e(a0Var);
            if (this.f30159f) {
                oVar.d(view, this.f30158e, q.a(a0Var));
            }
            y1.b0 f10 = a0Var.f();
            int l10 = f10 != null ? y1.b0.l(f10.r()) : -1;
            y1.b0 f11 = a0Var.f();
            oVar.b(view, y1.b0.l(a0Var.g()), y1.b0.k(a0Var.g()), l10, f11 != null ? y1.b0.k(f11.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new i());
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f30157d.h(), y1.b0.l(this.f30157d.g()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f30159f = z10;
        if (z10) {
            this.f30158e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return q.a(this.f30157d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (y1.b0.h(this.f30157d.g())) {
            return null;
        }
        return b0.a(this.f30157d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return b0.b(this.f30157d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return b0.c(this.f30157d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f30161h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    a(new z(0, this.f30157d.h().length()));
                    break;
                case 16908320:
                    d(277);
                    break;
                case 16908321:
                    d(278);
                    break;
                case 16908322:
                    d(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int a10;
        boolean z10 = this.f30161h;
        if (z10) {
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        a10 = l.f30112b.c();
                        break;
                    case 3:
                        a10 = l.f30112b.g();
                        break;
                    case 4:
                        a10 = l.f30112b.h();
                        break;
                    case 5:
                        a10 = l.f30112b.d();
                        break;
                    case 6:
                        a10 = l.f30112b.b();
                        break;
                    case 7:
                        a10 = l.f30112b.f();
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        a10 = l.f30112b.a();
                        break;
                }
            } else {
                a10 = l.f30112b.a();
            }
            this.f30154a.b(a10);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f30161h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10 = this.f30161h;
        if (z10) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "event");
        boolean z10 = this.f30161h;
        if (z10) {
            this.f30154a.a(keyEvent);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new x(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new y(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f30161h;
        if (z10) {
            a(new z(i10, i11));
            return true;
        }
        return z10;
    }
}
