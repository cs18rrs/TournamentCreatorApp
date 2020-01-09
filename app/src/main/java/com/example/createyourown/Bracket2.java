package com.example.createyourown;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import de.blox.treeview.BaseTreeAdapter;
import de.blox.treeview.TreeNode;
import de.blox.treeview.TreeView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class Bracket2 extends AppCompatActivity {
    public int PlayerCount() {
        Intent in = getIntent();
        String str = in.getStringExtra("PlayerCount");
        int pn = Integer.parseInt(str);
        return pn;
    }

    public int RoundCount() {
        Intent in = getIntent();
        String str = in.getStringExtra("PlayerCount");
        int pn = Integer.parseInt(str);
        int RoundCount = pn / 2;
        return RoundCount;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracket2);


        TreeView treeView = findViewById(R.id.treeview);

        BaseTreeAdapter adapter = new BaseTreeAdapter<ViewHolder>(this, R.layout.nodes) {


            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(View view) {
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(ViewHolder viewHolder, Object data, int position) {
                (viewHolder).mtextview.getText();
            }

        };

        treeView.setAdapter(adapter);
        TreeNode rootNode = new TreeNode();
        TreeNode BaseNode = new TreeNode();
        TreeNode child = new TreeNode();
        for(int i =1;i<=PlayerCount()/2;i++){
            BaseNode = new TreeNode();
            rootNode.addChild(BaseNode);
        }
        for(int i =1;i<=PlayerCount();i++) {
          child = new TreeNode();
            BaseNode.addChild(child);


        }




        adapter.setRootNode(rootNode);
    }








//    public class MaxPQ<key extends Comparable<key>> {
//        private key[] pq;
//        private int n =0;
//
//        public MaxPQ(int maxN){
//            pq=(key[]) new Comparable[maxN+1];
//
//        }
//        public boolean isEmpty (){
//            return n == 0;
//        }
//        public int size(){
//            return n;
//        }
//        public void insert(key v){
//            pq[++n]=v;
//            swim(n);
//        }
//        public key delMax(){
//            key max = pq[1];
//            exch(1,n--);
//            pq[n+1]=null;
//            sink(1);
//            return max;
//        }
//        private boolean less(int i,int j){
//            return pq[i].compareTo(pq[j])<0;
//        }
//        private void exch(int i ,int j){
//            key t =pq[i];
//            pq[i] =pq[j];
//            pq[j]=t;
//        }
//        private void swim(int k){
//       while(k>1 && less(k/2,k)){
//           exch(k/2,k);
//           k=k/2;
//       }
//        }
//        private void sink(int k){
//         while(2*k<=n){
//             int j = 2*k;
//             if(j<n && less(j,j+1))j++;
//             if(!less(k,j)) break;
//             exch(k,j);
//             k=j;
//         }
//        }
//
//    }

}