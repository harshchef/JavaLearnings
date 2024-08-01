// // import { HttpClient } from '@angular/common/http';
// // import { Component, OnInit } from '@angular/core';

// // @Component({
// //   selector: 'app-posts',
// //   templateUrl: './posts.component.html',
// //   styleUrls: ['./posts.component.css']
// // })
// // export class PostsComponent implements OnInit {
// //   private url = 'https://jsonplaceholder.typicode.com/posts';
// //   posts: any;

// //   constructor(private http: HttpClient) {}

// //   ngOnInit(): void {
// //     this.http.get(this.url).subscribe(data => {
// //       this.posts = data;
// //     });
// //   }

// //   createPost(title: HTMLInputElement): void {
// //     const post:any = { title: title.value };
// //     this.http.post(this.url, post).subscribe(response => {
// //       post['id']=response.id;
       
// //       console.log(response);
// //     });
// //   }
// // }


// // import { HttpClient } from '@angular/common/http';
// // import { Component, OnInit } from '@angular/core';

// // @Component({
// //   selector: 'app-posts',
// //   templateUrl: './posts.component.html',
// //   styleUrls: ['./posts.component.css']
// // })
// // export class PostsComponent implements OnInit {
// //   updatePost(post: any, newTitle: string): void {
// //     const updatedPost = { ...post, title: newTitle };
// //     this.http.put(`${this.url}/${post.id}`, updatedPost).subscribe(response => {
// //       // Update the post in the local array
// //       const index = this.posts.findIndex((p: any) => p.id === post.id);
// //       this.posts[index].title = newTitle;
// //       console.log(response);
// //     });
// //   }
// //   private url = 'https://jsonplaceholder.typicode.com/posts';
// //   posts: any;

// //   constructor(private http: HttpClient) {}

// //   ngOnInit(): void {
// //     this.http.get(this.url).subscribe(data => {
// //       this.posts = data;
// //     });
// //   }

// //   createPost(title: HTMLInputElement): void {
// //     let post: any = { title: title.value };
// //     title.value='';
// //     this.http.post<{ id: number, title: string }>(this.url, post).subscribe(response => {
// //       post['id'] = response.id;
// //       this.posts.splice(0,0,post);

// //       console.log(response);
// //     });
// //   }
// // }

// import { HttpClient } from '@angular/common/http';
// import { Component, OnInit } from '@angular/core';

// @Component({
//   selector: 'app-posts',
//   templateUrl: './posts.component.html',
//   styleUrls: ['./posts.component.css']
// })
// export class PostsComponent implements OnInit {
//   private url = 'https://jsonplaceholder.typicode.com/posts';
//   posts: any;

//   constructor(private http: HttpClient) {}

//   ngOnInit(): void {
//     this.http.get(this.url).subscribe(data => {
//       this.posts = data;
//     });
//   }

//   createPost(title: HTMLInputElement): void {
//     let post: any = { title: title.value };
//     title.value = '';
//     this.http.post<{ id: number, title: string }>(this.url, post).subscribe(response => {
//       post['id'] = response.id;
//       this.posts.splice(0, 0, post);
//       console.log('Post created:', response);
//     });
//   }

//   updatePost(post: any, newTitle: string): void {
//     const updatedPost = { ...post, title: newTitle };
//     this.http.put(`${this.url}/${post.id}`, updatedPost).subscribe(response => {
//       const index = this.posts.findIndex((p: any) => p.id === post.id);
//       this.posts[index].title = newTitle;
//       console.log('Post updated:', response);
//     });
//   }
// }


import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  private url = 'https://jsonplaceholder.typicode.com/posts';
  posts: any;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get(this.url).subscribe(data => {
      this.posts = data;
    });
  }

  createPost(title: HTMLInputElement): void {
    let post: any = { title: title.value };
    title.value = '';
    this.http.post<{ id: number, title: string }>(this.url, post).subscribe(response => {
      post['id'] = response.id;
      this.posts.splice(0, 0, post);
      console.log('Post created:', response);
    });
  }

  updatePost(post: any, newTitle: string): void {
    const updatedPost = { ...post, title: newTitle };
    this.http.put(`${this.url}/${post.id}`, updatedPost).subscribe(response => {
      const index = this.posts.findIndex((p: any) => p.id === post.id);
      this.posts[index].title = newTitle;
      console.log('Post updated:', response);
    });
  }

  deletePost(post: any): void {
    this.http.delete(`${this.url}/${post.id}`).subscribe(() => {
      // Remove the deleted post from the local array
      this.posts = this.posts.filter((p: any) => p.id !== post.id);
      console.log('Post deleted:', post.id);
    });
  }
}
