# 
Set custom font in your xml with the help of DataBinding.


![http://androidgig.com/setting-custom-font-through-xml-with-databinding/](https://github.com/androidgig/FontDataBindingSample/blob/master/device-2016-03-06-185823.png)

You just need to write one line of code in your xml : 

     app:font="@{`amatic`}"

Your binding method would be defined in custom class

    @BindingAdapter({"bind:font"})
    public static void setFont(TextView textView, String fontName) {
        textView.setTypeface(CustomFontFamily.getInstance().getFont(fontName));
    }

find full article on  http://androidgig.com/setting-custom-font-through-xml-with-databinding/