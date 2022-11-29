package bf;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: l  reason: collision with root package name */
    public static final a f18344l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f18345m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final float[] f18346n = {1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, -1.0f};

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f18347o = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: a  reason: collision with root package name */
    public final String f18348a = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}";

    /* renamed from: b  reason: collision with root package name */
    public final String f18349b = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform vec4 uTexSize;\nvarying vec2 vTextureCoord;\nvec4 AVGFreeSize() {\n  float inWidth = uTexSize.x;\n  float inHeight = uTexSize.y;\n  int cols = int(uTexSize.z);\n  int rows = int(uTexSize.w);\n  float texelSizeX = 1.0 / inWidth;\n  float texelSizeY = 1.0 / inHeight;\n  int halfcols = cols/2;\n  int halfrows = rows/2;\n  vec4 nSum = vec4( 0.0, 0.0, 0.0, 0.0 );\n  int nDenom = 0;\n  for( int m = 0; m < cols; m++ )\n  {\n    for( int n =0; n< rows; n++)\n    {\n      vec4 vecData = texture2D(sTexture, vTextureCoord + vec2(texelSizeX * float(m - halfcols), texelSizeY * float(n - halfrows)));\n      nSum = nSum + vecData;\n      nDenom = nDenom + 1;\n    }\n  }\n  return nSum / float(nDenom);\n}\nvoid main(){ gl_FragColor = AVGFreeSize();}\n";

    /* renamed from: c  reason: collision with root package name */
    public final FloatBuffer f18350c;

    /* renamed from: d  reason: collision with root package name */
    public final FloatBuffer f18351d;

    /* renamed from: e  reason: collision with root package name */
    public int f18352e;

    /* renamed from: f  reason: collision with root package name */
    public int f18353f;

    /* renamed from: g  reason: collision with root package name */
    public int f18354g;

    /* renamed from: h  reason: collision with root package name */
    public int f18355h;

    /* renamed from: i  reason: collision with root package name */
    public int f18356i;

    /* renamed from: j  reason: collision with root package name */
    public int f18357j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f18358k;

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

    public d() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        p.g(asFloatBuffer, "allocateDirect(VERTEX_SZ…eOrder()).asFloatBuffer()");
        this.f18350c = asFloatBuffer;
        this.f18358k = new float[4];
        asFloatBuffer.put(f18346n);
        asFloatBuffer.flip();
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        p.g(asFloatBuffer2, "allocateDirect(VERTEX_SZ…eOrder()).asFloatBuffer()");
        this.f18351d = asFloatBuffer2;
        asFloatBuffer2.put(f18347o);
        asFloatBuffer2.flip();
        int b10 = f18344l.b("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform vec4 uTexSize;\nvarying vec2 vTextureCoord;\nvec4 AVGFreeSize() {\n  float inWidth = uTexSize.x;\n  float inHeight = uTexSize.y;\n  int cols = int(uTexSize.z);\n  int rows = int(uTexSize.w);\n  float texelSizeX = 1.0 / inWidth;\n  float texelSizeY = 1.0 / inHeight;\n  int halfcols = cols/2;\n  int halfrows = rows/2;\n  vec4 nSum = vec4( 0.0, 0.0, 0.0, 0.0 );\n  int nDenom = 0;\n  for( int m = 0; m < cols; m++ )\n  {\n    for( int n =0; n< rows; n++)\n    {\n      vec4 vecData = texture2D(sTexture, vTextureCoord + vec2(texelSizeX * float(m - halfcols), texelSizeY * float(n - halfrows)));\n      nSum = nSum + vecData;\n      nDenom = nDenom + 1;\n    }\n  }\n  return nSum / float(nDenom);\n}\nvoid main(){ gl_FragColor = AVGFreeSize();}\n");
        this.f18352e = b10;
        GLES20.glUseProgram(b10);
        this.f18353f = GLES20.glGetAttribLocation(this.f18352e, "aPosition");
        this.f18354g = GLES20.glGetAttribLocation(this.f18352e, "aTextureCoord");
        this.f18355h = GLES20.glGetUniformLocation(this.f18352e, "uMVPMatrix");
        this.f18356i = GLES20.glGetUniformLocation(this.f18352e, "uTexMatrix");
        this.f18357j = GLES20.glGetUniformLocation(this.f18352e, "uTexSize");
        GLES20.glVertexAttribPointer(this.f18353f, 2, 5126, false, 8, (Buffer) asFloatBuffer);
        GLES20.glVertexAttribPointer(this.f18354g, 2, 5126, false, 8, (Buffer) asFloatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f18353f);
        GLES20.glEnableVertexAttribArray(this.f18354g);
    }

    @Override // bf.c
    public void a(int i10, float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        float[] fArr3 = this.f18358k;
        fArr3[0] = i15;
        fArr3[1] = i16;
        fArr3[2] = i17;
        fArr3[3] = i18;
        GLES20.glViewport(i11, i12, i13, i14);
        GLES20.glUseProgram(this.f18352e);
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        if (fArr2 != null) {
            GLES20.glUniformMatrix4fv(this.f18355h, 1, false, fArr2, 0);
        }
        if (fArr != null) {
            GLES20.glUniformMatrix4fv(this.f18356i, 1, false, fArr, 0);
        }
        GLES20.glUniform4fv(this.f18357j, 1, this.f18358k, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
        GLES20.glFlush();
    }

    @Override // bf.c
    public int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9728);
        GLES20.glBindTexture(36197, 0);
        return iArr[0];
    }

    @Override // bf.c
    public void release() {
        int i10 = this.f18352e;
        if (i10 >= 0) {
            GLES20.glDeleteProgram(i10);
        }
        this.f18352e = -1;
    }
}
