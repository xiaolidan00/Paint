package com.lidan.xiao.mypaint.helper;

import android.content.Context;
import android.util.DisplayMetrics;

import com.lidan.xiao.mypaint.R;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2018/1/11.
 */

public class ToolHelper {
    public static String color[]=new String[]{"red","pink","purple","deep_purple","indigo",
            "blue","light_blue","cyan","teal","green","light_green","lime","yellow",
            "amber", "orange","deep_orange","brown","grey","blue_grey"};
    public static int colorArray[]=new int[]{
            R.color.md_lime_50,R.color.md_lime_100,R.color.md_lime_200,R.color.md_lime_300,R.color.md_lime_400,R.color.md_lime_500,R.color.md_lime_600,
            R.color.md_lime_700,R.color.md_lime_800,R.color.md_lime_900,R.color.md_lime_A100,R.color.md_lime_A200,R.color.md_lime_A400,R.color.md_lime_A700,

            R.color.md_yellow_50,R.color.md_yellow_100,R.color.md_yellow_200,R.color.md_yellow_300,R.color.md_yellow_400,R.color.md_yellow_500,R.color.md_yellow_600,
            R.color.md_yellow_700,R.color.md_yellow_800,R.color.md_yellow_900,R.color.md_yellow_A100,R.color.md_yellow_A200,R.color.md_yellow_A400,R.color.md_yellow_A700,

            R.color.md_amber_50,R.color.md_amber_100,R.color.md_amber_200,R.color.md_amber_300,R.color.md_amber_400,R.color.md_amber_500,R.color.md_amber_600,
            R.color.md_amber_700,R.color.md_amber_800,R.color.md_amber_900,R.color.md_amber_A100,R.color.md_amber_A200,R.color.md_amber_A400,R.color.md_amber_A700,

            R.color.md_orange_50,R.color.md_orange_100,R.color.md_orange_200,R.color.md_orange_300,R.color.md_orange_400,R.color.md_orange_500,R.color.md_orange_600,
            R.color.md_orange_700,R.color.md_orange_800,R.color.md_orange_900,R.color.md_orange_A100,R.color.md_orange_A200,R.color.md_orange_A400,R.color.md_orange_A700,

            R.color.md_deep_orange_50,R.color.md_deep_orange_100,R.color.md_deep_orange_200,R.color.md_deep_orange_300,R.color.md_deep_orange_400,R.color.md_deep_orange_500,R.color.md_deep_orange_600,
            R.color.md_deep_orange_700,R.color.md_deep_orange_800,R.color.md_deep_orange_900,R.color.md_deep_orange_A100,R.color.md_deep_orange_A200,R.color.md_deep_orange_A400,R.color.md_deep_orange_A700,

            R.color.md_red_50,R.color.md_red_100,R.color.md_red_200,R.color.md_red_300,R.color.md_red_400,R.color.md_red_500,R.color.md_red_600,
            R.color.md_red_700,R.color.md_red_800,R.color.md_red_900,R.color.md_red_A100,R.color.md_red_A200,R.color.md_red_A400,R.color.md_red_A700,

            R.color.md_pink_50,R.color.md_pink_100,R.color.md_pink_200,R.color.md_pink_300,R.color.md_pink_400,R.color.md_pink_500,R.color.md_pink_600,
            R.color.md_pink_700,R.color.md_pink_800,R.color.md_pink_900,R.color.md_pink_A100,R.color.md_pink_A200,R.color.md_pink_A400,R.color.md_pink_A700,

            R.color.md_purple_50,R.color.md_purple_100,R.color.md_purple_200,R.color.md_purple_300,R.color.md_purple_400,R.color.md_purple_500,R.color.md_purple_600,
            R.color.md_purple_700,R.color.md_purple_800,R.color.md_purple_900,R.color.md_purple_A100,R.color.md_purple_A200,R.color.md_purple_A400,R.color.md_purple_A700,

            R.color.md_deep_purple_50,R.color.md_deep_purple_100,R.color.md_deep_purple_200,R.color.md_deep_purple_300,R.color.md_deep_purple_400,R.color.md_deep_purple_500,R.color.md_deep_purple_600,
            R.color.md_deep_purple_700,R.color.md_deep_purple_800,R.color.md_deep_purple_900,R.color.md_deep_purple_A100,R.color.md_deep_purple_A200,R.color.md_deep_purple_A400,R.color.md_deep_purple_A700,

            R.color.md_indigo_50,R.color.md_indigo_100,R.color.md_indigo_200,R.color.md_indigo_300,R.color.md_indigo_400,R.color.md_indigo_500,R.color.md_indigo_600,
            R.color.md_indigo_700,R.color.md_indigo_800,R.color.md_indigo_900,R.color.md_indigo_A100,R.color.md_indigo_A200,R.color.md_indigo_A400,R.color.md_indigo_A700,

            R.color.md_blue_50,R.color.md_blue_100,R.color.md_blue_200,R.color.md_blue_300,R.color.md_blue_400,R.color.md_blue_500,R.color.md_blue_600,
            R.color.md_blue_700,R.color.md_blue_800,R.color.md_blue_900,R.color.md_blue_A100,R.color.md_blue_A200,R.color.md_blue_A400,R.color.md_blue_A700,

            R.color.md_light_blue_50,R.color.md_light_blue_100,R.color.md_light_blue_200,R.color.md_light_blue_300,R.color.md_light_blue_400,R.color.md_light_blue_500,R.color.md_light_blue_600,
            R.color.md_light_blue_700,R.color.md_light_blue_800,R.color.md_light_blue_900,R.color.md_light_blue_A100,R.color.md_light_blue_A200,R.color.md_light_blue_A400,R.color.md_light_blue_A700,

            R.color.md_cyan_50,R.color.md_cyan_100,R.color.md_cyan_200,R.color.md_cyan_300,R.color.md_cyan_400,R.color.md_cyan_500,R.color.md_cyan_600,
            R.color.md_cyan_700,R.color.md_cyan_800,R.color.md_cyan_900,R.color.md_cyan_A100,R.color.md_cyan_A200,R.color.md_cyan_A400,R.color.md_cyan_A700,

            R.color.md_teal_50,R.color.md_teal_100,R.color.md_teal_200,R.color.md_teal_300,R.color.md_teal_400,R.color.md_teal_500,R.color.md_teal_600,
            R.color.md_teal_700,R.color.md_teal_800,R.color.md_teal_900,R.color.md_teal_A100,R.color.md_teal_A200,R.color.md_teal_A400,R.color.md_teal_A700,

            R.color.md_green_50,R.color.md_green_100,R.color.md_green_200,R.color.md_green_300,R.color.md_green_400,R.color.md_green_500,R.color.md_green_600,
            R.color.md_green_700,R.color.md_green_800,R.color.md_green_900,R.color.md_green_A100,R.color.md_green_A200,R.color.md_green_A400,R.color.md_green_A700,

            R.color.md_light_green_50,R.color.md_light_green_100,R.color.md_light_green_200,R.color.md_light_green_300,R.color.md_light_green_400,R.color.md_light_green_500,R.color.md_light_green_600,
            R.color.md_light_green_700,R.color.md_light_green_800,R.color.md_light_green_900,R.color.md_light_green_A100,R.color.md_light_green_A200,R.color.md_light_green_A400,R.color.md_light_green_A700,

            R.color.md_brown_50,R.color.md_brown_100,R.color.md_brown_200,R.color.md_brown_300,R.color.md_brown_400,R.color.md_brown_500,R.color.md_brown_600,
            R.color.md_brown_700,R.color.md_brown_800,R.color.md_brown_900,

            R.color.md_blue_grey_50,R.color.md_blue_grey_100,R.color.md_blue_grey_200,R.color.md_blue_grey_300,R.color.md_blue_grey_400,R.color.md_blue_grey_500,R.color.md_blue_grey_600,
            R.color.md_blue_grey_700,R.color.md_blue_grey_800,R.color.md_blue_grey_900,

            R.color.md_grey_50,R.color.md_grey_100,R.color.md_grey_200,R.color.md_grey_300,R.color.md_grey_400,R.color.md_grey_500,R.color.md_grey_600,
            R.color.md_grey_700,R.color.md_grey_800,R.color.md_grey_900,R.color.md_black_1000,R.color.md_white_1000,

    };


    //利用反射技术从R.drawable类中通过文件资源名获得相应的图像资源ID
//name res/drawable中图像名（不含扩展名）
    public static int getSpanDrawableId(String name){
        try{
            Field field=R.drawable.class.getField(name);
            return Integer.parseInt(field.get(null).toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    //利用反射技术从R.color类中通过文件资源名获得相应的图像资源ID
    public static int getSpanColorId(String name){
        try{
            Field field=R.color.class.getField(name);
            return Integer.parseInt(field.get(null).toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    private static final String RES_ID = "id";
    private static final String RES_STRING = "string";
    private static final String RES_DRABLE = "drable";
    private static final String RES_LAYOUT = "layout";
    private static final String RES_STYLE = "style";
    private static final String RES_COLOR = "color";
    private static final String RES_DIMEN = "dimen";
    private static final String RES_ANIM = "anim";
    private static final String RES_MENU = "menu";


    /**
     * 获取资源文件的id
     * @param context
     * @param resName
     * @return
     */
    public static int getId(Context context,String resName){
        return getResId(context,resName,RES_ID);
    }

    /**
     * 获取资源文件string的id
     * @param context
     * @param resName
     * @return
     */
    public static int getStringId(Context context,String resName){
        return getResId(context,resName,RES_STRING);
    }

    /**
     * 获取资源文件drable的id
     * @param context
     * @param resName
     * @return
     */
    public static int getDrawbleId(Context context,String resName){
        return getResId(context,resName,RES_DRABLE);
    }

    /**
     * 获取资源文件layout的id
     * @param context
     * @param resName
     * @return
     */
    public static int getLayoutId(Context context,String resName){
        return getResId(context,resName,RES_LAYOUT);
    }

    /**
     * 获取资源文件style的id
     * @param context
     * @param resName
     * @return
     */
    public static int getStyleId(Context context,String resName){
        return getResId(context,resName,RES_STYLE);
    }

    /**
     * 获取资源文件color的id
     * @param context
     * @param resName
     * @return
     */
    public static int getColorId(Context context,String resName){
        return getResId(context,resName,RES_COLOR);
    }

    /**
     * 获取资源文件dimen的id
     * @param context
     * @param resName
     * @return
     */
    public static int getDimenId(Context context,String resName){
        return getResId(context,resName,RES_DIMEN);
    }

    /**
     * 获取资源文件ainm的id
     * @param context
     * @param resName
     * @return
     */
    public static int getAnimId(Context context,String resName){
        return getResId(context,resName,RES_ANIM);
    }

    /**
     * 获取资源文件menu的id
     */
    public static int getMenuId(Context context,String resName){
        return getResId(context,resName,RES_MENU);
    }

    /**
     * 获取资源文件ID
     * @param context
     * @param resName
     * @param defType
     * @return
     */
    public static int getResId(Context context, String resName, String defType){
        return context.getResources().getIdentifier(resName, defType, context.getPackageName());
    }

}
