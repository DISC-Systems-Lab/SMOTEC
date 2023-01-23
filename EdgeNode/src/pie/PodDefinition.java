package pie;
	
public class PodDefinition {
		
	
	    
	private String version = "apps/v1";
	private String podname;
	private String appname;
	private int numReplica;
	private String registrykeyName;
	private String containerName;
	private String imageName;
	private String imagePullPolicy = "Always";
	private int containerPort;
	private int cpuDemand;
	private int memDemand;
	
	public int getCpuDemand() {
		return cpuDemand;
	}

	public void setCpuDemand(int cpuDemand) {
		this.cpuDemand = cpuDemand;
	}

	public int getMemDemand() {
		return memDemand;
	}

	public void setMemDemand(int memDemand) {
		this.memDemand = memDemand;
	}

	public String getPodname() {
		return podname;
	}
	
	public void setPodname(String podname) {
		this.podname = podname;
	}
	
	public String getAppname() {
		return appname;
	}
	
	public void setAppname(String appname) {
		this.appname = appname;
	}
	
	public int getNumReplica() {
		return numReplica;
	}
	
	public void setNumReplica(int numReplica) {
		this.numReplica = numReplica;
	}
	
	public String getMyregistrykey() {
		return registrykeyName;
	}
	
	public void setMyregistrykey(String myregistrykey) {
		this.registrykeyName = myregistrykey;
	}
	
	public String getContainerName() {
		return containerName;
	}
	
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	
	public String getImageName() {
		return imageName;
	}
	
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	public int getContainerPort() {
		return containerPort;
	}
	
	public void setContainerPort(int containerPort) {
		this.containerPort = containerPort;
	}
	
	
	
	/*
	apiVersion: apps/v1
	kind: Deployment
	metadata:
	  name: python-pub1
	  labels:
	    app: python-pub1
	spec:
	  replicas: 2
	  selector:
	    matchLabels:
	      app: python-pub1
	  template:
	    metadata:
	      labels:
	        app: python-pub1
	    spec:
	      imagePullSecrets:
	      - name: my-registry-key
	      containers:
	      - name: python-pub
	        image: zeinabne/edge-testbed:pub
	        imagePullPolicy: Always
	        resources:
      		  limits:
        		cpu: 300m
        		memory: 200Mi
      		  requests:
        		cpu: 200m
        		memory: 100Mi
	        ports:
	        - containerPort: 8081
	     */
	    
	@Override
	public String toString() {
	    	return "apiVersion: " + version + "\n"
	        		+"kind: Deployment\n" 
	                +"metadata: " + "\n"
	                +"  name: " + podname + "\n"
	                +"  labels: " + "\n"
	                +"    app: " + appname + "\n"
	                +"spec:\n" 
	                +"  replicas: " + numReplica + "\n"
	                +"  selctor:\n"
	                +"    matchLabels:\n"
	                +"      app: " + appname + "\n"
	                +"  template:\n"
	                +"    metadata:\n"
	                +"      labels:\n"
	                +"        app: " + appname + "\n"
	                +"    spec:\n"
	                +"      imagePullSecrets:\n"
	                +"      - name: " + registrykeyName+ "\n"
	                +"      containers:\n"
	                +"      - name: " + containerName + "\n"
	                +"        image: " + imageName + "\n"
	                +"        imagePullPolicy: " + imagePullPolicy+ "\n"
					+"        resources:\n"
					+"          limits:\n"
				    +"            cpu: "+getCpuDemand()+"m\n"
				    +"            memory: "+getMemDemand()+"Mi\n"
				    +"          requests:\n"
				    +"            cpu: "+getCpuDemand()+"m\n"
				    +"            memory: "+getMemDemand()+"Mi\n"
	                +"        ports:\n"
	                +"        - containerPort: " + containerPort ;
	                 
	    }
	}
