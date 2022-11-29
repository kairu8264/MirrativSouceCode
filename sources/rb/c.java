package rb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatButton;
import ao.g;
import co.f;
import com.dena.mirrorman.net.quiz.QuestionData;
import com.dena.mirrorman.net.quiz.QuizChoice;
import com.dena.mirrorman.net.quiz.QuizData;
import com.dena.mirrorman.net.quiz.QuizMessage;
import com.google.android.exoplayer2.SimpleExoPlayer;
import da.j;
import hb.a2;
import hb.b2;
import hb.v1;
import hb.x1;
import io.l;
import java.util.List;
import jo.h;
import jo.p;
import jo.q;
import kb.q1;
import nd.i0;
import nd.j0;
import nd.k0;
import nd.l0;
import nd.m0;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xn.a0;
import xn.s;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class c extends RelativeLayout implements q0 {
    public final List<ImageView> A;
    public final List<TextView> B;
    public int C;
    public b D;
    public Animator E;
    public int F;
    public String G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f50697w;

    /* renamed from: x  reason: collision with root package name */
    public final q1 f50698x;

    /* renamed from: y  reason: collision with root package name */
    public EnumC0776c f50699y;

    /* renamed from: z  reason: collision with root package name */
    public final List<Button> f50700z;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f50702x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f50702x = i10;
        }

        public final void a(View view) {
            p.h(view, "it");
            c.this.h(this.f50702x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public int f50703a;

        public b(long j10, long j11) {
            super(j10, j11);
            a(j10);
        }

        @SuppressLint({"StringFormatInvalid"})
        public final void a(long j10) {
            String str;
            int i10 = ((((int) j10) / 1000) - c.this.C) + 1;
            this.f50703a = i10;
            if (i10 <= 0) {
                c.this.f50698x.Y.setText(b2.text_q_time_finish);
                if (c.this.getQuizState() == EnumC0776c.QUIZ_ANSWER_TIME) {
                    c.this.setQuizState(EnumC0776c.QUIZ_ANSWER_CLOSED);
                    dq.c.c().l(new k0(a2.quiz_question_timeup, false));
                    if (c.this.F >= 0 || (str = c.this.G) == null) {
                        return;
                    }
                    c cVar = c.this;
                    dq.c.c().l(new i0(str, cVar.H, 0, cVar.J));
                    return;
                }
                return;
            }
            c.this.f50698x.Y.setText(c.this.getResources().getString(b2.text_q_time_limit, String.valueOf(this.f50703a)));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            c.this.m();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            a(j10);
        }
    }

    /* renamed from: rb.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0776c {
        QUIZ_ANSWER_TIME,
        QUIZ_ANSWER_CLOSED,
        QUIZ_ANSWER_SHOWN
    }

    @f(c = "com.dena.mirrativ.player.quiz.QuizQuestionContainerView$setAnswerData$1", f = "QuizQuestionContainerView.kt", l = {325}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50705w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50705w;
            if (i10 == 0) {
                m.b(obj);
                this.f50705w = 1;
                if (b1.a(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            dq.c.c().l(new j0());
            return v.f59242a;
        }
    }

    @f(c = "com.dena.mirrativ.player.quiz.QuizQuestionContainerView$setQuestionData$2", f = "QuizQuestionContainerView.kt", l = {254}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50706w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50706w;
            if (i10 == 0) {
                m.b(obj);
                this.f50706w = 1;
                if (b1.a(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            dq.c.c().l(new k0(a2.quiz_question_bgm, true));
            return v.f59242a;
        }
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void s(c cVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        cVar.r(i10);
    }

    private final void setChoiceButtonClickable(boolean z10) {
        for (Button button : this.f50700z) {
            button.setClickable(z10);
        }
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f50697w.getCoroutineContext();
    }

    public final EnumC0776c getQuizState() {
        return this.f50699y;
    }

    public final void h(int i10) {
        EnumC0776c enumC0776c = this.f50699y;
        if (enumC0776c == EnumC0776c.QUIZ_ANSWER_TIME && this.F < 0) {
            if (this.I) {
                this.F = i10;
                s(this, 0, 1, null);
                String str = this.G;
                if (str != null) {
                    dq.c.c().l(new i0(str, this.H, this.F + 1, this.J));
                    return;
                }
                return;
            }
            dq.c.c().l(new l0());
        } else if (enumC0776c == EnumC0776c.QUIZ_ANSWER_CLOSED && this.F < 0 && this.I) {
            t1.a aVar = t1.f61795x;
            Context context = this.f50698x.u().getContext();
            p.g(context, "binding.root.context");
            String string = getResources().getString(b2.text_q_timeout);
            p.g(string, "resources.getString(R.string.text_q_timeout)");
            aVar.a(context, string);
        }
    }

    public final boolean i(DialogInterface.OnClickListener onClickListener) {
        if (!this.I || this.L) {
            return true;
        }
        new a.C0045a(this.f50698x.u().getContext()).d(17301543).f(b2.text_p_leave).setPositiveButton(b2.W0, onClickListener).setNegativeButton(b2.f34727q0, null).k();
        return false;
    }

    public final void j() {
        if (this.f50699y != EnumC0776c.QUIZ_ANSWER_SHOWN) {
            this.F = -1;
            s(this, 0, 1, null);
        }
    }

    public final int k(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return v1.btn_quiz_choice1;
                    }
                    return v1.btn_quiz_choice4;
                }
                return v1.btn_quiz_choice3;
            }
            return v1.btn_quiz_choice2;
        }
        return v1.btn_quiz_choice1;
    }

    public final boolean l() {
        if (this.G == null) {
            return true;
        }
        return this.I;
    }

    public final void m() {
        q();
        this.f50698x.u().setVisibility(4);
    }

    public final void n() {
        if (this.f50699y == EnumC0776c.QUIZ_ANSWER_SHOWN) {
            m();
        }
    }

    public final void o() {
        this.f50698x.u().setAlpha(0.0f);
        this.f50698x.u().setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f50698x.u(), "alpha", 1.0f).setDuration(300L);
        p.g(duration, "ofFloat(binding.root, \"a…\", 1.0f).setDuration(300)");
        duration.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r0.d(this, null, 1, null);
    }

    public final void p() {
        this.J = false;
    }

    public final void q() {
        b bVar = this.D;
        if (bVar != null) {
            p.e(bVar);
            bVar.cancel();
            this.D = null;
        }
        Animator animator = this.E;
        if (animator != null) {
            p.e(animator);
            animator.cancel();
            this.E = null;
        }
        this.C = 0;
    }

    public final void r(int i10) {
        int size = this.f50700z.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f50700z.get(i11).setBackgroundResource(k(i11));
            Context context = getContext();
            int i12 = hb.t1.f34977r;
            this.f50700z.get(i11).setTextColor(c3.a.d(context, i12));
            this.A.get(i11).setColorFilter(c3.a.d(getContext(), i12), PorterDuff.Mode.SRC_IN);
            this.B.get(i11).setTextColor(c3.a.d(getContext(), i12));
            if (i10 >= 0 && i11 != i10) {
                this.f50700z.get(i11).setBackgroundResource(v1.btn_quiz_choice_dark);
                Context context2 = getContext();
                int i13 = hb.t1.f34978s;
                this.f50700z.get(i11).setTextColor(c3.a.d(context2, i13));
                this.A.get(i11).setColorFilter(c3.a.d(getContext(), i13), PorterDuff.Mode.SRC_IN);
                this.B.get(i11).setTextColor(c3.a.d(getContext(), i13));
            }
            if (i11 == this.F) {
                this.f50700z.get(i11).setSelected(true);
                this.A.get(i11).setVisibility(0);
            } else {
                this.f50700z.get(i11).setSelected(false);
                this.A.get(i11).setVisibility(4);
            }
        }
    }

    public final void setAnswerData(QuizMessage quizMessage) {
        QuestionData question;
        String answererNum;
        p.h(quizMessage, "param");
        q();
        QuizData quiz = quizMessage.getQuiz();
        if (quiz == null || (question = quizMessage.getQuestion()) == null) {
            return;
        }
        this.f50699y = EnumC0776c.QUIZ_ANSWER_SHOWN;
        if (TextUtils.isEmpty(quiz.getId())) {
            return;
        }
        if (!p.c(quiz.getId(), this.G)) {
            this.G = quiz.getId();
            this.H = 0;
            this.I = false;
        }
        if (this.H != question.getNth()) {
            this.I = false;
        }
        this.H = question.getNth();
        this.L = question.getNth() == quiz.getTotalQuestionNum();
        int correctAnswerNth = question.getCorrectAnswerNth() - 1;
        r(correctAnswerNth);
        setChoiceButtonClickable(false);
        this.f50698x.Z.setMax(question.getRemainingTime() * 1000);
        this.f50698x.Z.setProgress(0);
        this.f50698x.V.setText(getResources().getString(b2.text_q_number_question, String.valueOf(question.getNth())));
        this.f50698x.N.setVisibility(4);
        this.f50698x.T.setVisibility(4);
        if (this.I) {
            if (this.F == correctAnswerNth) {
                this.f50698x.N.setVisibility(0);
                dq.c.c().l(new k0(a2.quiz_answer_correct, false));
            } else {
                this.I = false;
                this.f50698x.T.setVisibility(0);
                dq.c.c().l(new k0(a2.quiz_answer_incorrect, false));
                if (!this.L && !this.K) {
                    dq.c.c().l(new m0());
                }
            }
        }
        this.f50698x.f38538a0.setText(getResources().getString(b2.text_q_number_people, String.valueOf(quiz.getRemainingUserNum()), String.valueOf(quiz.getTotalUserNum())));
        this.f50698x.X.setText(question.getBody());
        this.f50698x.Y.setText(b2.text_q_time_finish);
        int size = this.f50700z.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<QuizChoice> answers = question.getAnswers();
            if (answers != null && i10 < answers.size()) {
                Button button = this.f50700z.get(i10);
                QuizChoice quizChoice = (QuizChoice) a0.a0(answers, i10);
                String str = "";
                button.setText((quizChoice == null || (r5 = quizChoice.getText()) == null) ? "" : "");
                TextView textView = this.B.get(i10);
                QuizChoice quizChoice2 = (QuizChoice) a0.a0(answers, i10);
                if (quizChoice2 != null && (answererNum = quizChoice2.getAnswererNum()) != null) {
                    str = answererNum;
                }
                textView.setText(str);
            }
        }
        o();
        if (!this.L || quiz.getRemainingUserNum() <= 0) {
            return;
        }
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void setQuestionData(QuizMessage quizMessage) {
        QuestionData question;
        p.h(quizMessage, "param");
        q();
        QuizData quiz = quizMessage.getQuiz();
        if (quiz == null || (question = quizMessage.getQuestion()) == null) {
            return;
        }
        this.f50699y = EnumC0776c.QUIZ_ANSWER_TIME;
        if (TextUtils.isEmpty(quiz.getId())) {
            return;
        }
        if (!p.c(quiz.getId(), this.G)) {
            this.G = quiz.getId();
            this.H = 0;
            this.I = false;
            this.J = false;
            this.L = false;
        }
        if (this.H + 1 != question.getNth()) {
            this.I = false;
            this.J = false;
        }
        int nth = question.getNth();
        this.H = nth;
        if (nth == 1) {
            this.I = true;
            this.K = false;
        }
        this.F = -1;
        s(this, 0, 1, null);
        setChoiceButtonClickable(true);
        this.f50698x.Z.setMax(question.getRemainingTime() * 1000);
        this.f50698x.Z.setProgress(question.getRemainingTime() * 1000);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f50698x.Z, "progress", 0);
        ofInt.setDuration(question.getRemainingTime() * 1000);
        ofInt.setInterpolator(new LinearInterpolator());
        this.E = ofInt;
        p.e(ofInt);
        ofInt.start();
        this.f50698x.V.setText(getResources().getString(b2.text_q_number_question, String.valueOf(question.getNth())));
        this.f50698x.N.setVisibility(4);
        this.f50698x.T.setVisibility(4);
        this.f50698x.f38538a0.setText(getResources().getString(b2.text_q_number_people, String.valueOf(quiz.getRemainingUserNum()), String.valueOf(quiz.getTotalUserNum())));
        this.f50698x.X.setText(question.getBody());
        int size = this.f50700z.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<QuizChoice> answers = question.getAnswers();
            if (answers != null) {
                if (i10 < answers.size()) {
                    Button button = this.f50700z.get(i10);
                    QuizChoice quizChoice = (QuizChoice) a0.a0(answers, i10);
                    button.setText((quizChoice == null || (r4 = quizChoice.getText()) == null) ? "" : "");
                }
                this.B.get(i10).setText("");
            }
        }
        this.C = question.getDismissPopupAfter();
        b bVar = new b((question.getRemainingTime() + this.C) * 1000, 1000L);
        this.D = bVar;
        p.e(bVar);
        bVar.start();
        o();
        dq.c.c().l(new k0(a2.quiz_question_show, false));
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    public final void setQuizState(EnumC0776c enumC0776c) {
        this.f50699y = enumC0776c;
    }

    public final void t() {
        this.J = true;
        this.K = true;
        this.I = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f50697w = new j();
        q1 q1Var = (q1) androidx.databinding.f.e(LayoutInflater.from(context), x1.view_quiz_question_container, this, true);
        this.f50698x = q1Var;
        this.F = -1;
        int i11 = 0;
        List<Button> m10 = s.m(q1Var.F, q1Var.G, q1Var.H, q1Var.I);
        this.f50700z = m10;
        this.A = s.m(q1Var.J, q1Var.K, q1Var.L, q1Var.M);
        this.B = s.m(q1Var.B, q1Var.C, q1Var.D, q1Var.E);
        for (Object obj : m10) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                s.t();
            }
            AppCompatButton appCompatButton = (AppCompatButton) obj;
            p.g(appCompatButton, "button");
            g1.a(appCompatButton, new a(i11));
            i11 = i12;
        }
        m();
    }
}
