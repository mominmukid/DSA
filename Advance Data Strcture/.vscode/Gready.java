import java.util.*;

public class Gready {

    public static long lagestpolygen(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        long currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i]; 
        }
       Arrays.sort(arr);
       for(int i=n-1;i>=2;i--){
        if(currsum-arr[i]>arr[i])return currsum;
        currsum-=arr[i];
       }
       return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,12,1,2,5,50,3};
        System.out.println(lagestpolygen(arr));

        long i=Long.MAX_VALUE;
        
        // int start[]={3,5,5,8,0,1};
        // int end[]= {4,9,7,9,6,2};
        // int act[][]=new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        // act[i][0]=i;
        // act[i][1]=start[i];
        // act[i][2]=end[i];
        // }
        // Arrays.sort(act,Comparator.comparingDouble(o->o[2]));
        // int maxact=0;
        // ArrayList<Integer>ans=new ArrayList<>();

        // //frist act
        // maxact=1;
        // ans.add(act[0][0]);
        // int last=act[0][2];
        // for(int i=1;i<end.length;i++){
        // if(act[i][1]>=last){
        // maxact++;
        // ans.add(act[i][0]);
        // last=act[i][2];
        // }

        // }
        // System.out.println("the maximum Activeties="+ maxact);
        // for(int i=0;i<ans.size();i++){
        // System.out.print("A"+ans.get(i)+" ");
        // }
        // ArrayList<Integer>l=new ArrayList<>();
        // int value[]={100,200,50,300,500};
        // int weight[]={30,40,10,30,40};
        // int totalweight=150;
        // double ratio[][]=new double[value.length][2];
        // for(int i=0;i<value.length;i++){
        // ratio[i][0]=i;
        // ratio[i][1]=weight[i]/(double)value[i];
        // Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        // }
        // int profit=0;
        // for(int i=ratio.length-1;i>=0;i--){
        // int idx=(int)ratio[i][0];
        // if(weight[idx]<=totalweight){
        // l.add(idx);
        // profit+=value[idx];
        // totalweight= totalweight-weight[idx];
        // }else{
        // profit+=(ratio[i][1]*totalweight);
        // totalweight=0;
        // break;
        // }
        // }
        // for(int i=0;i<l.size();i++){
        // System.out.println("A"+l.get(i)+" ");
        // }
        // System.out.println(profit);

        // int a[]={4,1,8,7};
        // int b[]={2,3,6,5};
        // Arrays.sort(a);
        // Arrays.sort(b);
        // int maxdiff=0;
        // for(int i=0;i<a.length;i++){
        // maxdiff+=Math.abs(a[i]-b[i]);
        // }
        // System.out.println(maxdiff);

        // int pair[][]={
        // {5,24},
        // {39,60},
        // {5,28},
        // {27,40},
        // {50,90}
        // };
        // ArrayList<Integer>l=new ArrayList<>();
        // Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
        // l.add(pair[0][0]);
        // int maxchin=0;
        // int lastdigi=pair[0][1];
        // maxchin=1;
        // for(int i=1;i<pair.length;i++){
        // if(pair[i][0]>=lastdigi){
        // maxchin++;
        // l.add(pair[i][0]);
        // lastdigi=pair[i][1];
        // }
        // }
        // System.out.println("The max Length of chain is= "+maxchin);
        // for(int i=0;i<l.size();i++){
        // System.out.print("A"+l.get(i)+" ");
        // }
        // int coin[] = { 1, 4,10 };
        // int st = 0;
        // int ed = coin.length - 1;
        // while (st <= ed) {
        //     int temp = coin[st];
        //     coin[st] = coin[ed];
        //     coin[ed] = temp;
        //     st++;
        //     ed--;
        // }
        // ArrayList<Integer> l = new ArrayList<>();
        // int note = 0;
        // int amount = 19;
        // for (int i = 0; i < coin.length; i++) {
        //     if (coin[i] <= amount) {
        //         while (coin[i] <= amount) {
        //             note++;
        //             l.add(coin[i]);
        //             amount-= coin[i];
        //         }
        //     }
        // }
        // System.out.println(note);
        // for(int i=0;i<l.size();i++){
        //     System.out.println(l.get(i));
        // }
        // int job[][]={
        //     {4,20},
        //     {1,10},
        //     {1,40},
        //     {1,30}
        // };
        // Arrays.sort(job,Comparator.comparingDouble(o->o[1]));

        // int profit=40;
        // ArrayList<Integer>l=new ArrayList<>();
        // int time=job[job.length-1][0];
        // l.add(job[job.length-1][0]);
        // for(int i=job.length-2;i>=0;i--){
        //     if(time <job[i][0]){
        //      profit+=job[i][1];
        //      time=job[i][0];
        //      l.add(job[i][0]);
        //     }
        // }
        // System.out.println(profit);
        // for(int i=0;i<l.size();i++){
        //     System.out.print("J"+l.get(i)+" ");
        // }

        // int n=4;
        // int m=6;
        // Integer vartical[]={2,1,3,1,4};
        // Integer horizontal[]={4,1,2};

        // Arrays.sort(horizontal,Comparator.reverseOrder());
        // Arrays.sort(vartical,Comparator.reverseOrder());
        // for(int i=0;i<horizontal.length;i++){
        //     System.out.print(horizontal[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<vartical.length;i++){
        //     System.out.print(vartical[i]+" ");
        // }



        // int h=0,v=0;
        // int hp=1,vp=1;
        // int cost=0;
        // while (h<horizontal.length && v<vartical.length) {
        //     if(vartical[v]<=horizontal[h]){
        //       cost=cost+(horizontal[h]*vp);
        //         hp++;
        //         h++;
        //     }else{
        //         cost+=(vartical[v]*hp);
        //         vp++;
        //         v++;
        //     }
        // }
        //     while (h<horizontal.length) {
        //         cost+=(horizontal[h]*vp);
        //         hp++;
        //         h++;
        //     }
        //     while (v<vartical.length) {
        //         cost+=(vartical[v]*hp);
        //         vp++;
        //         v++;
            
        // }
        // System.out.println(cost);


       
        }
    
}