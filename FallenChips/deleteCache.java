//update manifest android.permission.CLEAR_CACHE
//use deleteCache(context)
	
	public static void deleteCache(Context context) {
	    try {
	        java.io.File directory = context.getCacheDir();
	        String sourceDirectoryPath = directory.toString().substring(0, directory.toString().length()-5); 
	        java.io.File dir = new File(sourceDirectoryPath);
	        if (dir != null && dir.isDirectory()) {
	            deleteAppDir(dir);

	        }
	    } catch (Exception e) {
	    	com.peel.util.Log.e(PeelUtil.class.getName(), e.getMessage());
	    }
	}
	
	public static boolean deleteAppDir(java.io.File dir) {
	    if (dir != null && dir.isDirectory()) {
	        String[] children = dir.list();
	        for (int i = 0; i < children.length; i++) {
	            boolean success = deleteAppDir(new java.io.File(dir, children[i]));
	            if (!success) {
	                return false;
	            }
	        }
	    }
	    // The directory is now empty so delete it
	    return dir.delete();
	}