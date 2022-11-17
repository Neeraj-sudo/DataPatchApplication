package com.DataPatchApp.files;

import java.util.HashMap;

public class PatchConfig {

	public HashMap getPatch() {
		
		HashMap<String, String> patchConfig = new HashMap<>();
      
      patchConfig.put("id", "id");
      patchConfig.put("name", "pName");
      patchConfig.put("Age", "pAge");
      
      return patchConfig;
	}
}
