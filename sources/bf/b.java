package bf;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: k  reason: collision with root package name */
    public static final a f18330k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18331l = 8;

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f18332m = {1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, -1.0f};

    /* renamed from: n  reason: collision with root package name */
    public static final float[] f18333n = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: a  reason: collision with root package name */
    public final FloatBuffer f18334a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatBuffer f18335b;

    /* renamed from: c  reason: collision with root package name */
    public int f18336c;

    /* renamed from: d  reason: collision with root package name */
    public int f18337d;

    /* renamed from: e  reason: collision with root package name */
    public int f18338e;

    /* renamed from: f  reason: collision with root package name */
    public int f18339f;

    /* renamed from: g  reason: collision with root package name */
    public int f18340g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f18341h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18342i;

    /* renamed from: j  reason: collision with root package name */
    public int f18343j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final int b(String str, String str2) {
            int glCreateShader = GLES20.glCreateShader(35633);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            int i10 = 0;
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
            int glCreateShader2 = GLES20.glCreateShader(35632);
            GLES20.glShaderSource(glCreateShader2, str2);
            GLES20.glCompileShader(glCreateShader2);
            GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader2);
            } else {
                i10 = glCreateShader2;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, glCreateShader);
            GLES20.glAttachShader(glCreateProgram, i10);
            GLES20.glLinkProgram(glCreateProgram);
            return glCreateProgram;
        }
    }

    public b() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        p.g(asFloatBuffer, "allocateDirect(VERTEX_SZ…eOrder()).asFloatBuffer()");
        this.f18334a = asFloatBuffer;
        float[] fArr = new float[16];
        this.f18341h = fArr;
        asFloatBuffer.put(f18332m);
        asFloatBuffer.flip();
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        p.g(asFloatBuffer2, "allocateDirect(VERTEX_SZ…eOrder()).asFloatBuffer()");
        this.f18335b = asFloatBuffer2;
        asFloatBuffer2.put(f18333n);
        asFloatBuffer2.flip();
        int b10 = f18330k.b("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\n\nvoid main() {\n\tgl_Position = uMVPMatrix * aPosition;\n\tvTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nvarying highp vec2 vTextureCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        this.f18336c = b10;
        GLES20.glUseProgram(b10);
        this.f18337d = GLES20.glGetAttribLocation(this.f18336c, "aPosition");
        this.f18338e = GLES20.glGetAttribLocation(this.f18336c, "aTextureCoord");
        this.f18339f = GLES20.glGetUniformLocation(this.f18336c, "uMVPMatrix");
        this.f18340g = GLES20.glGetUniformLocation(this.f18336c, "uTexMatrix");
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f18339f, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f18340g, 1, false, fArr, 0);
        GLES20.glVertexAttribPointer(this.f18337d, 2, 5126, false, 8, (Buffer) asFloatBuffer);
        GLES20.glVertexAttribPointer(this.f18338e, 2, 5126, false, 8, (Buffer) asFloatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f18337d);
        GLES20.glEnableVertexAttribArray(this.f18338e);
    }

    @Override // bf.c
    public void a(int i10, float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        GLES20.glViewport(i11, i12, i13, i14);
        c(i10, fArr, fArr2);
    }

    @Override // bf.c
    public int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glBindTexture(36197, 0);
        return iArr[0];
    }

    public final void c(int i10, float[] fArr, float[] fArr2) {
        GLES20.glUseProgram(this.f18336c);
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        if (fArr2 != null) {
            GLES20.glUniformMatrix4fv(this.f18339f, 1, false, fArr2, 0);
        }
        if (fArr != null) {
            GLES20.glUniformMatrix4fv(this.f18340g, 1, false, fArr, 0);
        }
        if (!this.f18342i) {
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glDrawArrays(4, 0, this.f18343j);
        }
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
        GLES20.glFlush();
    }

    @Override // bf.c
    public void release() {
        int i10 = this.f18336c;
        if (i10 >= 0) {
            GLES20.glDeleteProgram(i10);
        }
        this.f18336c = -1;
    }
}
