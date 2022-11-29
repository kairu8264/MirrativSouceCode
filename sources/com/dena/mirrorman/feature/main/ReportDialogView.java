package com.dena.mirrorman.feature.main;

import ae.em;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import co.l;
import com.dena.mirrorman.feature.main.ReportDialogView;
import com.dena.mirrorman.net.api.response.Feature;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import hf.r;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import nd.i1;
import nd.w0;
import of.j;
import of.s;
import oq.a;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.g;
import wn.m;
import wn.v;
import xn.t;

/* loaded from: classes2.dex */
public final class ReportDialogView extends ScrollView implements oq.a {
    public static final b D = new b(null);
    public static final int E = 8;
    public final wn.f A;
    public final wn.f B;
    public final wn.f C;

    /* renamed from: w  reason: collision with root package name */
    public final em f25866w;

    /* renamed from: x  reason: collision with root package name */
    public qe.f f25867x;

    /* renamed from: y  reason: collision with root package name */
    public qe.a f25868y;

    /* renamed from: z  reason: collision with root package name */
    public final b0 f25869z;

    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RadioGroup f25870w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AppCompatButton f25871x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ EditText f25872y;

        public a(RadioGroup radioGroup, AppCompatButton appCompatButton, EditText editText) {
            this.f25870w = radioGroup;
            this.f25871x = appCompatButton;
            this.f25872y = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            p.h(editable, "c");
            if (this.f25870w.getCheckedRadioButtonId() == 0 && s.f45426a.b(this.f25872y.getText().toString())) {
                this.f25871x.setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "c");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "c");
            if (this.f25870w.getCheckedRadioButtonId() == 0) {
                this.f25871x.setEnabled(true);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.main.ReportDialogView$report$1$1", f = "ReportDialogView.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f25873w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ qe.a f25875y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f25876z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qe.a aVar, String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f25875y = aVar;
            this.f25876z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f25875y, this.f25876z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25873w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest request = ReportDialogView.this.getRequest();
                    String b10 = this.f25875y.b();
                    String c11 = this.f25875y.c();
                    String str = this.f25876z;
                    String str2 = this.A;
                    String a10 = this.f25875y.a();
                    this.f25873w = 1;
                    if (request.postUserBadReport(b10, c11, str, str2, a10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                qe.f fVar = ReportDialogView.this.f25867x;
                if (fVar != null) {
                    fVar.a();
                }
            } catch (Throwable th2) {
                qe.f fVar2 = ReportDialogView.this.f25867x;
                if (fVar2 != null) {
                    fVar2.b(th2);
                }
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25877w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25878x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25879y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25877w = aVar;
            this.f25878x = aVar2;
            this.f25879y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            xq.a b10;
            oq.a aVar = this.f25877w;
            vq.a aVar2 = this.f25878x;
            io.a<? extends uq.a> aVar3 = this.f25879y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(i1.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25880w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25881x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25882y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25880w = aVar;
            this.f25881x = aVar2;
            this.f25882y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f25880w;
            vq.a aVar2 = this.f25881x;
            io.a<? extends uq.a> aVar3 = this.f25882y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRRequest.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25883w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25884x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25885y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25883w = aVar;
            this.f25884x = aVar2;
            this.f25885y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final r invoke() {
            xq.a b10;
            oq.a aVar = this.f25883w;
            vq.a aVar2 = this.f25884x;
            io.a<? extends uq.a> aVar3 = this.f25885y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(r.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ ReportDialogView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final boolean f(AppCompatButton appCompatButton, View view, int i10, KeyEvent keyEvent) {
        p.h(appCompatButton, "$okButton");
        if (keyEvent.getAction() == 0 && i10 == 66 && appCompatButton.isEnabled()) {
            appCompatButton.performClick();
            return true;
        }
        return false;
    }

    public static final void g(EditText editText, Context context, AppCompatButton appCompatButton, RadioGroup radioGroup, int i10) {
        p.h(editText, "$editText");
        p.h(context, "$context");
        p.h(appCompatButton, "$okButton");
        if (i10 != 0) {
            editText.setHint(context.getString(f1.text_input_report));
            appCompatButton.setEnabled(true);
            return;
        }
        editText.setHint(context.getString(f1.text_input_report_required));
        appCompatButton.setEnabled(!s.f45426a.b(editText.getText().toString()));
    }

    private final r getFeatureHelper() {
        return (r) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRRequest getRequest() {
        return (MRRequest) this.B.getValue();
    }

    private final i1 getSharedApplicationModel() {
        return (i1) this.A.getValue();
    }

    public static final void h(ReportDialogView reportDialogView, EditText editText, RadioGroup radioGroup, Context context, View view) {
        p.h(reportDialogView, "this$0");
        p.h(editText, "$editText");
        p.h(radioGroup, "$radioGroup");
        p.h(context, "$context");
        reportDialogView.m(editText.getText().toString(), String.valueOf(radioGroup.getCheckedRadioButtonId()), reportDialogView.f25868y);
        j.f45405a.c(context, editText);
    }

    public static final void i(Context context, EditText editText, ReportDialogView reportDialogView, View view) {
        p.h(context, "$context");
        p.h(editText, "$editText");
        p.h(reportDialogView, "this$0");
        j.f45405a.c(context, editText);
        qe.f fVar = reportDialogView.f25867x;
        if (fVar != null) {
            fVar.onClose();
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @SuppressLint({"RestrictedApi"})
    public final void l(RadioGroup radioGroup) {
        ViewGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        radioGroup.setLayoutParams(layoutParams);
        List<Feature.Category> h10 = getFeatureHelper().h();
        if (h10 != null) {
            ArrayList arrayList = new ArrayList(t.u(h10, 10));
            for (Feature.Category category : h10) {
                RadioButton radioButton = new RadioButton(getContext());
                radioButton.setId(category.getId());
                radioButton.setText(category.getTitle());
                radioButton.setTextColor(c3.a.d(getContext(), w0.text_black));
                radioButton.setLayoutParams(layoutParams);
                radioGroup.addView(radioButton);
                arrayList.add(v.f59242a);
            }
        }
    }

    public final void m(String str, String str2, qe.a aVar) {
        if (aVar != null) {
            uo.l.d(r0.a(g1.c().plus(this.f25869z)), null, null, new c(aVar, str, str2, null), 3, null);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d2.a.a(this.f25869z, null, 1, null);
        super.onDetachedFromWindow();
    }

    public final void setArguments(qe.a aVar) {
        p.h(aVar, "arguments");
        this.f25868y = aVar;
    }

    public final void setListener(qe.f fVar) {
        p.h(fVar, "listener");
        this.f25867x = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDialogView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b10;
        p.h(context, "context");
        em emVar = (em) androidx.databinding.f.e(LayoutInflater.from(context), b1.view_report_dialog, this, true);
        this.f25866w = emVar;
        b10 = i2.b(null, 1, null);
        this.f25869z = b10;
        cr.a aVar = cr.a.f28611a;
        this.A = g.b(aVar.b(), new d(this, null, null));
        this.B = g.b(aVar.b(), new e(this, null, null));
        this.C = g.b(aVar.b(), new f(this, null, null));
        final RadioGroup radioGroup = emVar.C;
        p.g(radioGroup, "binding.categoryRadioGroup");
        final EditText editText = emVar.D;
        p.g(editText, "binding.editReport");
        final AppCompatButton appCompatButton = emVar.E;
        p.g(appCompatButton, "binding.reportButton");
        AppCompatButton appCompatButton2 = emVar.B;
        p.g(appCompatButton2, "binding.cancelButton");
        l(radioGroup);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: qe.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean f10;
                f10 = ReportDialogView.f(AppCompatButton.this, view, i11, keyEvent);
                return f10;
            }
        });
        editText.addTextChangedListener(new a(radioGroup, appCompatButton, editText));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: qe.e
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i11) {
                ReportDialogView.g(editText, context, appCompatButton, radioGroup2, i11);
            }
        });
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: qe.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportDialogView.h(ReportDialogView.this, editText, radioGroup, context, view);
            }
        });
        appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: qe.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportDialogView.i(context, editText, this, view);
            }
        });
    }
}
